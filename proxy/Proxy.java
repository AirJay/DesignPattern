package proxy;

public class Proxy implements Subject{

	Subject sub = new RealSubject();
	public void action() {
		System.out.println("Starting");
		sub.action();
		System.out.println("end");
		
	}

}
