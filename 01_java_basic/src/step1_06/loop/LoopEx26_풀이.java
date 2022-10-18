package step1_06.loop;


/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

//다시 확인

public class LoopEx26_풀이 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++) {
			
			int location10 = i / 10;	//i의 십의 자리를 10으로 나눈 값
			int location1 = i % 10;		//i의 일의 자리를 10으로 나눈 값의 나머지
			int count = 0;				//369 개수 카운트 값 변수 (짝의 개수)
			
			if(location10 != 0 && location10 % 3 == 0) {	//i의 십의 자리를 3으로 나눈 값의 나머지가 0일 때와 10미만의 수가 아닐 때
				count++;				//카운트 값을 하나 올린다
			}
			if(location1 != 0  && location1 % 3 == 0) {	//i의 일의 자리를 3으로 나눈 값의 나머지가 0일 때
				count++;				//카운트 값을 하나 올린다
			}
			
			if (count == 2) {			//카운트 값이 2면
				System.out.print("짝짝" + " ");
			}
			else if (count == 1) {
				System.out.print("짝" + " ");
			}
			else {
				System.out.print(i + " ");
			}
			
		}
	}

}
