package step1_06.loop;

import java.util.Random;

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

/* 1. random import
 * 2. random 변수
 * 3. for문 (int i = 1; i <= 10; i++)
 * 4. 총점 변수
 * 5. 평균 변수
 * 6. 합격자 변수
 */


public class LoopEx24_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int pass = 0;
		int total = 0;
		int maxNum = 0;
		int maxScore = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			int rScore = ran.nextInt(100)+1;
			System.out.print(rScore + " ");
			
			if (rScore >= 60) {
				pass++;
				total += rScore;
			}
			if (maxScore < rScore) {
				maxScore = rScore;	//새로운 rScore 값이 기존의 maxScore보다 높으면 maxScore에 그 값이 들어감 
				maxNum = i;			//지금의 순서(번째)가 i이므로 maxNum에 i 변수 값 집어넣기
			}
		}
		double average = total / 10;
		System.out.println("총 점수: " + total + "점");
		System.out.println("평균점수: " + average + "점");
		System.out.println("합격자 수: " + pass + "명");
		System.out.println("1등: " + maxNum+ "번, " + maxScore + "점");
		

	}

}
