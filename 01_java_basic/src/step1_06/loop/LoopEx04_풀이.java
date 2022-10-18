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


public class LoopEx04_풀이 {

	public static void main(String[] args) {
	
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	int score = 0; //사용자 점수
	int answerCnt = 0; //사용자가 맞힌 횟수
	
	int i = 1;
	while (i < 6) {
		
		int x = ran.nextInt(8) + 2;
		int y = ran.nextInt(9) + 1;
		int answer = x * y;
		
		System.out.println(x + "x" + y + "= ");
		int myAnswer = scan.nextInt();
		
		if (answer == myAnswer) {
			answerCnt++;
			}
		i++;
		}
		score = answerCnt * 20;
		System.out.println("성적 = " + score + "점");
		
		scan.close();
	}

}
