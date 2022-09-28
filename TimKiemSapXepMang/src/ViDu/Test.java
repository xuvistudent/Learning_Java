package ViDu;

import java.util.Arrays;

public class Test {
	
	public static int[] reversed(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for(int i = x.length - 1;i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,8,2,6,4,3,7,9};
		int[] b = new int[15];
		
		// Sap xep tang dan
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		// Ham tim kiem 
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
		
//		// Ham dien gia tri
//		Arrays.fill(a, 5);
//		System.out.println(Arrays.toString(a));
		
		// Sap xep giam dan
		System.out.println(Arrays.toString(a));
		a = Test.reversed(a);
		System.out.println(Arrays.toString(a));
		
	}
}
