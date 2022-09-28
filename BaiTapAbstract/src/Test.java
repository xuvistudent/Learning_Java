
public class Test {
	public static void main(String[] args) {
		HangSanXuat hsx1= new HangSanXuat("VN Airlines", "Viet Nam");
		HangSanXuat hsx2 = new HangSanXuat("Japan", "Nhat Ban");
		HangSanXuat hsx3 = new HangSanXuat("US", "My");
		
		MayBay p1 = new MayBay(hsx1, "E95");
		PhuongTienDiChuyen p2 = new XeOto(hsx2, "E92");
		PhuongTienDiChuyen p3 = new XeDap(hsx3);
		
		System.out.println(p1.layTenHangSanXuat());
		p1.batDau();
		p1.tangToc();
		p1.dungLai();
		System.out.println(p1.layVanToc());
		p1.catCanh();
		p1.haCanh();
		
		System.out.println(p2.layTenHangSanXuat());
		p2.batDau();
		p2.tangToc();
		p2.dungLai();
		System.out.println(p2.layVanToc());
		
		System.out.println(p3.layTenHangSanXuat());
		p3.batDau();
		p3.tangToc();
		p3.dungLai();
		System.out.println(p3.layVanToc());
	}
}
