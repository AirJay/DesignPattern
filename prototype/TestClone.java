package prototype;


public class TestClone implements Cloneable {
	
	String name = "";
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		TestClone tc = new TestClone();
		tc.setName("Hexiong");
		
		
		TestClone tcClone = (TestClone)tc.clone();
		
		System.out.println(tcClone.getName());
		
		System.out.println(tcClone == tc);
	}

}
