package ViDu;

import java.util.Arrays;

public class Test {
	
	public static int[] reversed(int[] a) {
		int index = 0;
		int[] rs = new int[a.length];
		for(int i = a.length -1; i >= 0; i--) {
			rs[index] = a[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,8,2,6,4,3,7,9};
		int[] b = new int[15];
		
		// Ham sap xep
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// Ham tim kiem
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
		
		// Ham dien gia tri
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
		
		// Ham sap xep giam dan
		a = Test.reversed(a);
		System.out.println(Arrays.toString(a));
	}
}
