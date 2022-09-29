package ViDu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		String s = "Xin chao cac ban, tui la Peter";
		
		String[] a = s.split(" ");
		
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chao, minh la xuvi. Minh la lap trinh vien!";
		
		String[] c = s2.split("\\.|\\,");
		
		System.out.println(Arrays.toString(c));
		
		String name = "Hoang Xuan Viet";
		
		System.out.println(name);
		
		String[] n = name.split(" ");
		
		System.out.println(n[n.length-1]);
		
		
	}
}
