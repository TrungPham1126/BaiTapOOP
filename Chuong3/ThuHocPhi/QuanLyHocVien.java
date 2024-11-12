package ThuHocPhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyHocVien {
	private ArrayList<HocVien> danhSachHocVien = new ArrayList<>();

	public void themHocVien(HocVien hocvien) {
		hocvien.nhapThongTin();
		danhSachHocVien.add(hocvien);
	}

	public void timKiemHocVien(String hoTen) {
		boolean found = false;
		for (HocVien hv : danhSachHocVien) {
			if (hv.hoTen.equalsIgnoreCase(hoTen)) {
				hv.inThongTin();
				found = true;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy học viên có tên: " + hoTen);
		}
	}

	public void sapXepHocVien() {
		Collections.sort(danhSachHocVien, new Comparator<HocVien>() {
			public int compare(HocVien hv1, HocVien hv2) {
				return hv1.hoTen.compareToIgnoreCase(hv2.hoTen);
			}
		});
		System.out.println("Danh sách học viên sau khi sắp xếp:");
		for (HocVien hv : danhSachHocVien) {
			hv.inThongTin();
		}
	}
}
