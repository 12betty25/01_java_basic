package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.print("앞(0) 또는 뒤(1), 선택은? ");
		int user = scan.nextInt();
		
		if (coin == user) {
			System.out.println("맞췄다");
		}
		if (coin != user) {
			System.out.println("틀렸다");
		}
		
		


	}

}
