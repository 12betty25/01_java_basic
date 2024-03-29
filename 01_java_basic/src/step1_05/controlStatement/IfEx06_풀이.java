package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력해주세요: ");
		int num1 = scan.nextInt();
		System.out.println("숫자 2를 입력해주세요: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "x" + num2 + "= ?");
		int answer = num1 * num2;
		System.out.print("정답은?");
		int userAns = scan.nextInt();
		
		if (answer == userAns) {
			System.out.println("정답");
		}
		if (answer != userAns) {
			System.out.println("땡");
		}

	}

}
