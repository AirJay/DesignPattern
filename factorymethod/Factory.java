package factorymethod;



public class Factory {
    public Employee createEmployee (String type) {
        if(type.equals("Programer")) {
            return new Programer();
        } else if(type.equals("PA")) {
            return new PA();
        } else {
            return new Programer();
        }
    }

}