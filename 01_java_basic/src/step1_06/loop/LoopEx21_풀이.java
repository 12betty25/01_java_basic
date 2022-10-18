package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		

		int count = 0;
		
		for (int i = 1; i <= 5; i++) {
			int rNum1 = ran.nextInt(8) + 2;
			int rNum2 = ran.nextInt(9) + 1;
			
			int answer = rNum1 * rNum2;
			
			System.out.print(rNum1 + "*" + rNum2 + "= ");
			int myAnswer = scan.nextInt();
			
			if (answer == myAnswer) {
				count++;
			}
			
		}
		int score = count * 20;
		System.out.println("점수는: " + score);
		
	}

}
