package dynamicproxy1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class MyProxy {
	public static Object newProxyInstance(Class interfa, InvocationHandler h)
			throws Exception {
		String rt = "\r\n";
		String java = "package dynamicproxy1;" + rt;
		java += "import java.lang.reflect.Method;" + rt;
		java += "public class $Proxy implements " + interfa.getName() + "{"
				+ rt;
		java += "   private InvocationHandler hand;" + rt;
		java += "   public $Proxy(InvocationHandler hand){" + rt;
		java += "       this.hand=hand;" + rt;
		java += "   }" + rt;

		Method[] methods = interfa.getMethods();
		for (Method method : methods) {
			java += "   public void " + method.getName() + "(){" + rt;
			java += "       try{" + rt;
			java += "       Method m=" + interfa.getName()
					+ ".class.getMethod(\"" + method.getName() + "\");" + rt;
			java += "       hand.invoke(this,m);" + rt;
			java += "   }catch(Exception e){e.printStackTrace();}" + rt;
			java += "   }" + rt;
		}
		java += "}" + rt;
		System.out.println(java);

		String filepath = System.getProperty("user.dir")
				+ "/bin/dynamicproxy1";
		File file = new File(filepath + "/$Proxy.java");
		try {
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write(java);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager javafile = javac.getStandardFileManager(null,
				null, null);
		String filename = filepath + "/$Proxy.java";
		Iterable units = javafile.getJavaFileObjects(filename);
		CompilationTask t = javac.getTask(null, javafile, null, null, null,
				units);
		t.call();
		try {
			javafile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		URL[] urls;
		Object obj = null;
		try {
			urls = new URL[] { new URL("file:///D:/02Develop/eclispe/workspace_training/DPTraining/bin/") };
			URLClassLoader classload = new URLClassLoader(urls);
			Class clazz = classload.loadClass("dynamicproxy1.$Proxy");
			Constructor cons = clazz.getConstructor(InvocationHandler.class);
			obj = cons.newInstance(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;

	}

}
