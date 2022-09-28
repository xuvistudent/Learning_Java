package ViDu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Tran Van Thanh", "Lop 1", 9.1);
		SinhVien sv2 = new SinhVien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8.9);
		SinhVien sv3 = new SinhVien(199, "Nguyen Van An", "Lop 2", 9.1);
		
		System.out.println(sv3.compareTo(sv1));
		//System.out.println(sv3.compareTo(sv2));
	}
}
