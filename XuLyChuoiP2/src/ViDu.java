
public class ViDu {
	public static void main(String[] args) {
		String s1 = "TITV.vn";
		String s2 = "titv.vn";
		String s3 = "TITV.vn";
		
		//Ham equals => so sanh 2 chuoi giong nhau, co phan biet hoa thuong
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//Ham equalsIgnoreCase => khong phan biet hoa thuong
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//Ham compareTo => so sanh > < = ?
		String sv1 = "Nguyen Van A";
		String sv2 = "Nguyen Van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));
		System.out.println(sv1.compareTo(sv4));
		
		//Ham compareToIgnoreCase tuong tu compareTo nhung khong phan biet hoa thuong
		
		//Ham regionMatches => so sanh mot doan
		String r1 = "titv.vn";
		String r2 = "tv.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		//Ham startWith => kiem tra chuoi bat dau bang
		String sdt = "0908059160";
		System.out.println(sdt.startsWith("091"));
		
		//Ham endWith => kiem tra chuoi ket thuc bang
		String tenFile = "xuvi.jpeg";
		System.out.println(tenFile.endsWith("jpeg"));
	}
}
