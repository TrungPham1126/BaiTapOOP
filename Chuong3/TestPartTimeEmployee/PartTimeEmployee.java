package TestPartTimeEmployee;

public class PartTimeEmployee extends Employee {
	int hoursPerWeed;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hourPerWeed) {
		super(name, age, gender, employerName, dateHired);
		this.hoursPerWeed = hourPerWeed;

	}

	public int getHoursPerWeed() {
		return hoursPerWeed;
	}

	public void setHoursPerWeed(int hoursPerWeed) {
		this.hoursPerWeed = hoursPerWeed;
	}

	public String toString() {
		return super.toString() + "," + hoursPerWeed;
	}

}
