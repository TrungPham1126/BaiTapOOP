package BenhNhan;

public class test {
	public static void main(String[] args) {
		BenhVien bv1 = new BenhVien("dfg", "dtd", "rtr");
		BenhNhan bn1 = new BenhNhan("dfg", 30, 'M', "dfg", "dfgg", bv1);
		BenhNhan bn2 = new BenhNhan();
		bn2.setTen("dsf");
		bn2.setTuoi(5);
		bn2.setGioiTinh('M');
		bn2.setTienSu("ddf");
		bn2.setChuanDoan("sfds");
		bn2.setBenhVien(bv1);
		System.out.println(bn1.toString());
		System.out.println(bn2.toString());
	}
}