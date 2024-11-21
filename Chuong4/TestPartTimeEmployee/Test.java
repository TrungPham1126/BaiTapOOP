package TestPartTimeEmployee;

public class Test {
	public static void main(String[] args) {
		PartTimeEmployee ept1 = new PartTimeEmployee("Trung", 19, 'M', "Vinh", "20/10/2023", 30);
		System.out.println(ept1.toString());
		PartTimeEmployee ept2 = new PartTimeEmployee();
		ept2.setName("Vinh");
		ept2.setAge(19);
		ept2.setGender('M');
		ept2.setEmpolyerName("Trung");
		ept2.setDateHired("20/12/2023");
		ept2.setHoursPerWeed(100);
		System.out.println(ept2.getName() + ept2.getAge() + ept2.getGender() + ept2.getEmpolyerName()
				+ ept2.getDateHired() + ept2.getHoursPerWeed());

	}
}
