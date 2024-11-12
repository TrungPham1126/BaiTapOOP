package Personaddress;

public class Nhanvien {
	private String name;
	private Address diaChi = new Address();
	private String dob;
	private char gender;

	public Nhanvien() {

	}

	public Nhanvien(String name, Address diaChi, String dob, char gender) {
		this.name = name;
		this.diaChi = diaChi;
		this.dob = dob;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDiaChi(Address diaChi) {
		this.diaChi = diaChi;
	}

	public Address getDiaChi() {
		return diaChi;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Ten " + name + " dia chi " + diaChi + " dob " + dob + " Gioi tinh " + gender;
	}
}
