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

public class LoopEx24_정답예시 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int totalScore = 0;
		double avg = 0.0;
		int passStudentCnt = 0;
		int maxScore = 0;
		int maxNum = 0;
		
		for (int i = 1; i < 11; i++) {
			
			int score = ran.nextInt(100) + 1;   //1~100사이의 랜덤값 생성
			System.out.print(score + " ");	    // 보여주기
			
			totalScore += score;				// 최종값에 누적해서 더함
			
			if (score >= 60) {   				// 생성된 점수가 60점이상이면(합격)
				passStudentCnt++;				// 합격된학생 변수 1증가
			}
			
			if (maxScore < score) {		         // 제일높은점수보다 지금 점수가 높으면
				maxScore = score;				// 제일높은점수에 지금 점수를 변수에 저장
				maxNum = i;						// 지금 번째의 순서를 변수에 저장
			}	
			
		}
			
		System.out.println();
		
		avg = totalScore / 10.0;
		
		System.out.println("총점 = " + totalScore + "점");
		System.out.println("평균 = " + avg + "점");
		System.out.println("합격생 수 = " + passStudentCnt + "명");
		System.out.println("1등학생 = " + maxScore + "[" + maxNum + "번]");

	}

}
