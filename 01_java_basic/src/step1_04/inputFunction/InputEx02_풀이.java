package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_풀이 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("숫자 1을 입력하세요: ");
		int num1 = scan.nextInt();
		System.out.print("숫자 2을 입력하세요: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + num2);
		
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		
		System.out.println("숫자를 입력하세요: ");
		int numOne = scan.nextInt();
		System.out.println(numOne % 2 == 0);
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		
		System.out.println("성적을 입력하세요: ");
		int grade = scan.nextInt();
		System.out.println(grade >= 60 && grade <= 100);
		scan.close();
		
	}
	
}
