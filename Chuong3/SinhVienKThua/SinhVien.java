package SinhVienKThua;

public class SinhVien extends Nguoi {
	String lop;
	String nganh;
	Truong truong;

	public SinhVien() {
		super();

	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public Truong getTruong() {
		return truong;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}

	public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
		super(ten, tuoi, gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}

	public String toString() {
		return super.toString() + " lop: " + lop + " nganh: " + nganh + truong;
	}

}
