package composite;

import java.util.Set;

public interface Employee {
	public void setName(String name);
	public String getName();
	public void addEmpoyee(Employee employee);
	public Set getEmployee();

}
