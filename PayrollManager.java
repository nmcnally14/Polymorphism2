/**
 * 
 */
package polymorphism;

/**
 * @author Nicola
 *
 */
public class PayrollManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("Joe Soap");
		e1.setJobTitle("Cleaner");

		e1.displayAll();
		e1.calculateWages(40);
		
		Lecturer l1 = new Lecturer();
		l1.setName("Aidan McG");
		l1.setJobTitle("Lecturer");
		l1.setSubject("CS");
		
		l1.calculateWages(40);
		
		Researcher r1 = new Researcher();
		r1.setName("Nicola McN");
		r1.setJobTitle("Researcher");
		r1.setSchool("QUB");
		
		r1.calculateWages(40);
		
		Employee [] employees = {e1, l1, r1};
		processWages(employees);
		
		
	}
	// method to get wages
	/**
	 * 
	 * @param employees
	 */
	public static void processWages(Employee [] employees)	{
		
		// enhanced for loop
		for (Employee employee : employees)	{
			employee.calculateWages(40);
		}
		
	}

}
