package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_풀이 {

	public static void main(String[] args) {
		
		
		
		for(int i = 1; i < 51; i++) {
			int location10 = i / 10;
			int location1 = i % 10;
			int count = 0;
			
			if (location10 != 0 &&location10 % 3 == 0) {
				count++;
				
				// 1 ~ 9까지는 0.i로 나오기 때문에 0으로 되는 
			}
			if (location1 != 0 && location1 % 3 == 0) {
				count++;
			}
			
			if (count == 2) {
				System.out.println("짝짝");
			}
			else if (count == 1) {
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}
		}
		
		
		
	}

}
