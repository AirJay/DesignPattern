package factorymethod;

public class Test {
	
    public static void main(String[] args) {
        Factory myFactory = new Factory();
        Employee programer = myFactory.createEmployee("Programer");
        programer.doWork();

        Employee pa = myFactory.createEmployee("PA");
        pa.doWork();
    }

}
