/**
 * 
 */
package polymorphism;

/**
 * @author Nicola
 *
 */
public class Lecturer extends Employee {
	
	private String subject;
	
	
	// generate getters and setters
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/* (non-Javadoc)
	 * @see polymorphism.Employee#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	/* (non-Javadoc)
	 * @see polymorphism.Employee#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	/* (non-Javadoc)
	 * @see polymorphism.Employee#getJobTitle()
	 */
	@Override
	public String getJobTitle() {
		// TODO Auto-generated method stub
		return super.getJobTitle();
	}

	/* (non-Javadoc)
	 * @see polymorphism.Employee#setJobTitle(java.lang.String)
	 */
	@Override
	public void setJobTitle(String jobTitle) {
		// TODO Auto-generated method stub
		super.setJobTitle(jobTitle);
	}

	/* (non-Javadoc)
	 * @see polymorphism.Employee#getBasePay()
	 */
	@Override
	public double getBasePay() {
		// TODO Auto-generated method stub
		return super.getBasePay();
	}

	/* (non-Javadoc)
	 * @see polymorphism.Employee#setBasePay(double)
	 */
	@Override
	public void setBasePay(double basePay) {
		// TODO Auto-generated method stub
		super.setBasePay(basePay);
	}

	/* (non-Javadoc)
	 * @see polymorphism.Employee#displayAll()
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println();
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// method on wages
	@Override
	public void calculateWages (int hoursWorked)	{
		double wages = hoursWorked*getBasePay() * 20.2;
		displayAll();
		System.out.println("Wages : "+wages);

	}
	

}