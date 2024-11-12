package LuongLaoDong;

public class test142 {

	public class Main {
		public static void main(String[] args) {
			LaoDongPhoThong laoDongPhoThong = new LaoDongPhoThong("Nguyen Van A", "Ha Noi", 26);
			laoDongPhoThong.inThongTin();

			System.out.println();

			KiSu kiSu = new KiSu("Tran Van B", "Ho Chi Minh", 23, 2.5, 5000000);
			kiSu.inThongTin();
		}
	}

}
