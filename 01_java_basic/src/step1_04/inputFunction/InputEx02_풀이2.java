package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_풀이2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.print("숫자 1 입력: ");
		int a = scan.nextInt();
		System.out.print("숫자 2 입력: ");
		int b = scan.nextInt();
		int sum = a + b;
		
		System.out.println(sum);
		
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("숫자 1개를 입력하세요: ");
		int c = scan.nextInt();
		System.out.println(c % 2 == 1);
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		
		
	}
	
}
