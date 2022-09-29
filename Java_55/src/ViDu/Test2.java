package ViDu;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Tran Van Thanh", "Java", 6.5);
		SinhVien sv2 = new SinhVien(100, "Nguyen Thi Thanh Hoa", "Java", 7.0);
		SinhVien sv3 = new SinhVien(199, "Nguyen Van An", "Java", 7.0);
		SinhVien sv4 = new SinhVien(199, "Nguyen Van Binh", "Java", 7.0);
		
		SinhVien[] a_sv = new SinhVien[]{sv1, sv2, sv3};
		
		// Ham sap xep
		System.out.println(Arrays.toString(a_sv));
		Arrays.sort(a_sv);
		System.out.println(Arrays.toString(a_sv));
		
		// Tim kiem An
		System.out.println(Arrays.binarySearch(a_sv, sv1));
		System.out.println(Arrays.binarySearch(a_sv, sv4));
	}
}
