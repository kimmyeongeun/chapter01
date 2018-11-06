package chapter01;

public class WhileTest {

	public static void main(String[] args) {
		
		/* 1에서 부터 10까지 숫자를 출력 */
		//초기화
		int i = 0;
		
		//진입조건 검사
		while(i < 10) {
			System.out.println(i);
			
			//증감연산
			i = i + 1;
		}
		
		System.out.println("끝!");

	}

}
