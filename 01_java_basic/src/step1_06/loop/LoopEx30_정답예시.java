package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_정답예시 {

	public static void main(String[] args) {

		int start = 1;
		int end = 5;
		
		for (int i = 0; i < 5; i++) { //한줄에 5개의 숫자
			
			if (i % 2 == 0) {	//만약 짝수줄이면 	
				for (int j = start; j <= end; j++) { //start~end 까지의 숫자를 
					System.out.print(j + " ");       //출력
				}
			}
			else {									 //홀수줄이면
				for (int j = end; j >= start; j--) { //end~start까지 (반대로) 숫자
					System.out.print(j + " ");		 //출력 
				}
			}
			System.out.println();					 //둘 중 한줄을 출력하고 나서 한줄 띄기 

			start = end + 1;						 
			end = end + 5;
			
		}

	}

}
