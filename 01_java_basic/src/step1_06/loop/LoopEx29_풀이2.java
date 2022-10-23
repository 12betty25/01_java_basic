package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx29_풀이2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		int prime = scan.nextInt();

		
		for(int i = 2; i < prime; i++) {
			
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
		scan.close();
		
		
	}
	
}
