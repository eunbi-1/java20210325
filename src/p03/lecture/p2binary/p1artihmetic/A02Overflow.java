package p03.lecture.p2binary.p1artihmetic;

public class A02Overflow {
	public static void main(String[] args) {
		int a = 20_0000_0000;
		int b = 20_0000_0000;
		
		int c = a + b;
		
		System.out.println(c);
		
		long x = 20_0000_0000;
		long y = 20_0000_0000;
		
		long z = x + y;
		System.out.println(z);
//		데이터 타입의 크기 차이 MAX
	}
}
