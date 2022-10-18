package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_풀이 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(100) + 1;
		
		int score = 100;
		int count = 0;
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Up or Down?: ");
			int me = scan.nextInt();
			
			if(me > com) {
				System.out.println("Down!");
				count++;
			}
			else if(me < com) {
				System.out.println("Up!");
				count++;
			}
			else if (me == com) {
				System.out.println("Bingo!");
				break;
			}
		}
		int totScore = score - (count * 5);
		System.out.println(totScore);
		
	}

}
