
public class Test {
	public static void main(String[] args) {
		NguoiBaLan nbl = new NguoiBaLan("Balan", 2002);
		nbl.an();
		nbl.ngu();
		nbl.xinChao();
		
		NguoiMy nm = new NguoiMy("Pulisic", 1998);
		nm.an();
		nm.ngu();
		nm.xinChao();
		
		NguoiVietNam nvn = new NguoiVietNam("Viet", 2002);
		nvn.an();
		nvn.ngu();
		nvn.xinChao();
	}
}
