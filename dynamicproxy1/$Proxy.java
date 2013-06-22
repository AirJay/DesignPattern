package dynamicproxy1;
import java.lang.reflect.Method;
public class $Proxy implements dynamicproxy1.HelloWorld{
   private InvocationHandler hand;
   public $Proxy(InvocationHandler hand){
       this.hand=hand;
   }
   public void sayHelloWorld(){
       try{
       Method m=dynamicproxy1.HelloWorld.class.getMethod("sayHelloWorld");
       hand.invoke(this,m);
   }catch(Exception e){e.printStackTrace();}
   }
}
