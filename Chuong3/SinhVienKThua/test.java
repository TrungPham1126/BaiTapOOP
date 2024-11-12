package SinhVienKThua;

public class test {
	public static void main(String[] args) {
		Truong t1 = new Truong("dhcn", "bac tu liem", "ko biet");
		Truong t2 = new Truong();
		t2.setTen("dhbk");
		t2.setDiaChi("caugiay");
		t2.setHieuTruong(" ko biet ");

		SinhVien sv1 = new SinhVien("trung", 19, 'M', "ktpm3", "ktpm", t1);

		SinhVien sv2 = new SinhVien();
		sv2.setTen("vinh");
		sv2.setTuoi(19);
		sv2.setGioiTinh('M');
		sv2.setLop("ktpm3");
		sv2.setNganh("ktpm");
		sv2.setTruong(t2);

		System.out.println(sv1.toString());
		System.out.println(
				sv2.getTen() + sv2.getTuoi() + sv2.getGioiTinh() + sv2.getLop() + sv2.getNganh() + sv2.getTruong());
	}

}
