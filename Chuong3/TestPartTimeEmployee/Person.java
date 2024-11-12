package TestPartTimeEmployee;

public class Person {
	protected String name;
	protected int age;
	protected char gender;

	public Person() {
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return " ten " + name + " tuoi " + age + " gtinh " + gender;

	}

}
