import java.util.Scanner;

public class ViDU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("------");
		//Ham lay do dai chuoi
		System.out.println(s.length());
		
		//Ham lay ki tu tai vi tri i
		System.out.println(s.charAt(0));
		
		//Ham getChars(vi tri bat dau, vi tri ket thuc
		//mang luu du lieu, vi tri bat dau luu cua mang)
		char[] arrayChar = new char[100];
		s.getChars(2, 5, arrayChar, 0);
		for(int i=0;i<arrayChar.length;i++) {
			System.out.println(arrayChar[i]);
		}
		//Ham getBytes in ra gia tri cua ky tu do
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}
