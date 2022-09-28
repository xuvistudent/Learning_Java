
public class Test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.timMin(5, 5));
		System.out.println(mm.timMin(5.5, 6.0));
		System.out.println(mm.tinhTong(5.0, 6.0));
		double arr[] = new double[] {1,2,3,4,5};
		System.out.println(mm.tinhTong(arr));
	}
}
