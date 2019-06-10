/**
 * 
 */
package polymorphism;

/**
 * @author Nicola
 *
 */
public class Employee {
	
	private String name;
	private String jobTitle;
	private double basePay = 30.00;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getBasePay() {
		return basePay;
	}
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	// method on wages
	public void calculateWages (int hoursWorked)	{
		double wages = hoursWorked*basePay;
		displayAll();
		System.out.println("Wages : "+wages);
	}
	
	// method on displaying employee
	public void displayAll()	{
		System.out.println("Name  : "+this.name);
		System.out.println("Job tile  : "+this.jobTitle);
		System.out.println("Basepay  : "+this.basePay);
	}

}
