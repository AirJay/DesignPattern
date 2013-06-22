package composite;

import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager manager1 = new Manager("Qi Wei");
		Manager manager2 = new Manager("Lucy");
		Manager manager3 = new Manager("Rebecca");
		Staff staff1 = new Staff("Hexiong");
		manager1.addEmpoyee(manager2);
		manager1.addEmpoyee(manager3);
		manager3.addEmpoyee(staff1);
		
		
		Set<Employee> employees = manager1.getEmployee();
		
		for (Employee employee : employees){
			
			String name = employee.getName();
			System.out.println(name);
			
			if (employee.getEmployee() != null){
				//
			}
			
		}

	}

}
