package BenhNhan;

public class BenhNhan extends Nguoi {
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhVien;

	public BenhNhan() {
		super();
	}

	public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}

	public String getTienSu() {
		return tienSu;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public String getChuanDoan() {
		return chuanDoan;
	}

	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	public String toString() {
		return super.toString() + " Tiền sử: " + tienSu + ", Chuẩn đoán: " + chuanDoan + ", Bệnh viện: "
				+ benhVien.toString();
	}
}
