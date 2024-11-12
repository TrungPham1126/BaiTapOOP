package Person;

public class Person {
	private String name;
	private String dob;
	private String pob;
	private char gender;
	private String email;
	private String phone;

	public Person() {
	}

	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.email = email;
		this.gender = gender;
		this.phone = phone;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getPob() {
		return pob;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public String toString() {
		return "ten= " + name + "dob= " + dob + "pob= " + pob + "gender= " + gender + "email" + phone;
	}

}