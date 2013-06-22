package dynamicproxy1;


public class HelloWorldTest {
	
	public static void main(String[] args) throws Exception {
        HelloWorld helloWorld=new HelloWorldImpl();
        
        InvocationHandler h = new TimerHandler(helloWorld);
        
        HelloWorld proxy = (HelloWorld)MyProxy.newProxyInstance(HelloWorld.class, h);
        
        proxy.sayHelloWorld();
          

    }


}
