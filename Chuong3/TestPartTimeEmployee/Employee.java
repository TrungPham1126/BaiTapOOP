package TestPartTimeEmployee;

public class Employee extends Person {
	String empolyerName;
	String dateHired;

	public Employee() {
		super();

	}

	public Employee(String name, int age, char gender, String employerName, String dateHired) {
		super(name, age, gender);
		this.empolyerName = employerName;
		this.dateHired = dateHired;

	}

	public String getEmpolyerName() {
		return empolyerName;
	}

	public void setEmpolyerName(String empolyerName) {
		this.empolyerName = empolyerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	public String toString() {
		return super.toString() + " empolyerName " + empolyerName + " dateHired " + dateHired;
	}
}
