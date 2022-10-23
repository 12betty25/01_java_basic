package step1_06.loop;

import java.util.Iterator;
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

public class LoopEx29_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		int prime = scan.nextInt();
		int count = 0;
		
		for (int i = 2; i < prime; i++) { //소수는 2부터 시
			
			count = 0;					  //숫자 하나씩 올라갈 때마다 다시 0으로 리셋 
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {		  //만약 i 나누기 j가 0일 때 
					count++;			  //count 하나씩 올리기 
				}
			}
			
			if (count == 2) { 			  //만약 count가 2면 (1과 그 숫자)
				System.out.print(i + " ");	//print
			}
			
		}
		scan.close();
		
	}
	
}
