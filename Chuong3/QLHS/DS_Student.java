package QLHS;

import java.util.ArrayList;

public class DS_Student {
	protected ArrayList<Student> danhsach;

	public DS_Student() {
		this.danhsach = new ArrayList<Student>();
	}

	public DS_Student(ArrayList<Student> danhsach) {
		this.danhsach = danhsach;
	}

	public void addStudent(Student st) {
		this.danhsach.add(st);
	}

	public void printfST() {
		for (Student student : danhsach) {
			System.out.println(student.toString());

		}

	}

	public boolean find(Student st) {

		return this.danhsach.contains(st);

	}

	public boolean removeStudent(Student st) {
		return this.danhsach.remove(st);
	}

}
