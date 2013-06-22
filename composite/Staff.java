package composite;

import java.util.Set;

public class Staff implements Employee{
	
	private String name;
	public Staff(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addEmpoyee(Employee employee){
		System.out.println("Staff cannot have employee");
	}
	public Set getEmployee(){
		return null;
	}

}
