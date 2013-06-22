package composite;

import java.util.HashSet;
import java.util.Set;

public class Manager implements Employee {
	private String name;
	private Set employees;

	public Manager(String name) {
		this.name = name;
		employees = new HashSet();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addEmpoyee(Employee employee){
		employees.add(employee);
	}
	
	public Set getEmployee(){
		return employees;
	}
}
