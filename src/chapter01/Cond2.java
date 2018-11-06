package chapter01;

public class Cond2 {

	public static void main(String[] args) {
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		//Q2: 최대값
		//Output: 최대값은 50 입니다.
		//Sol:

		if( a1 > a2 ) {
			// a1이 a2보다 큰 경우
			// -> ? a1 <> a3
		} if( a1 > a3) {
			System.out.println("최대값은" + a1 + "입니다.");
		} else {
			System.out.println("최대값은" + a3 + "입니다.");
		} else {
			System.out.println("최대값은" + a2 + "입니다.");
		
		}
		
	}

}
