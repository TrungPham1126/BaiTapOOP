package QLHS;

import java.util.Objects;

public class Student implements Comparable<Student> {
	protected String ten;
	protected byte tuoi;
	protected double dTB;

	public Student() {

	}

	public Student(String ten) {
		this.ten = ten;
	}

	public Student(String ten, byte tuoi, double dTB) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.dTB = dTB;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public byte getTuoi() {
		return tuoi;
	}

	public void setTuoi(byte tuoi) {
		this.tuoi = tuoi;
	}

	public double getdTB() {
		return dTB;
	}

	public void setdTB(double dTB) {
		this.dTB = dTB;
	}

	public String toString() {
		return "Student [ten=" + ten + ", tuoi=" + tuoi + ", dTB=" + dTB + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dTB, ten, tuoi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(ten, other.ten);
	}

	public int compareTo(Student o) {
		return this.ten.compareTo(o.ten);
	}

}
