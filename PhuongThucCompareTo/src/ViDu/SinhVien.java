package ViDu;

public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTB;
	
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTB) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		} else {
			return s;
		}
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		if ((this.diemTB - o.diemTB) > 0) {
			return 1;
		} else if ((this.diemTB - o.diemTB) < 0){
			return -1;
		} else {
			return 0;
		}
	}
	
//	@Override
//	public int compareTo(SinhVien o) {
//		// TODO Auto-generated method stub
//		String tenThis = this.getTen();
//		String tenO = o.getTen();
//		return tenThis.compareTo(tenO);
//	}
	
}
