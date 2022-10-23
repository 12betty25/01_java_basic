package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxScore = 0;
		int maxStu = 0;
		int pass = 0;
		int total = 0;
		double average = 0;
		for (int i = 1; i < 11; i++) {
			int score = ran.nextInt(100) + 1;
			
			if (score > 60) {
				pass++;
			}
			if (maxScore < score) {
				maxScore = score;
				maxStu = i;
			}
			System.out.print(score + " ");
			total += score;
		}
		
		System.out.println();
		average = total/10.0;
		System.out.println("총점: " + total + ", 평균: " + average);
		System.out.println("1등 학생: " + maxStu + ",("+maxScore+")");
		
		
	}

}
