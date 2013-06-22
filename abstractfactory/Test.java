package abstractfactory;

public class Test {
	
    public static void main(String[] args) {
        Factory seniorFactory = new SeniorFactory();
        Employee programer = seniorFactory.programerCreater();
        programer.doWork();

        Factory juniorFactory = new JuniorFactory();
        Employee pa = juniorFactory.paCreator();
        pa.doWork();
        
    }

}
