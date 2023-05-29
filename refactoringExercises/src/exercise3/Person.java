package exercise3;

public class Person {

	private Department department;

	public void setDepartment(Department arg) {
		department = arg;
	}
    
    // Desnecessario -> Manter apenas na classe "Department" 
	// public Person getManager() { 
        // 	return department.getManager();
	// }

}
