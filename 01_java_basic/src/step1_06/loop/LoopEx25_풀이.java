package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx25_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maxNum = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("정수 하나를 입력해주세요: ");
			int user = scan.nextInt();
			
			if(maxNum < user) {
				maxNum = user;
			}
		}
		System.out.println(maxNum);
		
		
	}

}
