/**
 * 
 */
package polymorphism;

/**
 * @author Nicola
 *
 */
public class Researcher extends Employee {
	
	private String school;

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	// method on wages
		@Override
		public void calculateWages (int hoursWorked)	{
			double wages = hoursWorked*getBasePay() * 22.2;
			displayAll();
			System.out.println("Wages : "+wages);

		}
}
