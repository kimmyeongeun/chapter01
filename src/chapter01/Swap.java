package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		
		// Q1: n1 값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		
		if (n1 < n2) {
			// swap
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);

	}

}
