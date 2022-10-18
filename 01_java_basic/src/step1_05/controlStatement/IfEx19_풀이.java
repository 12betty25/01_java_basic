package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.println("이체 받을 계좌를 입력하세요: ");
		int acc = scan.nextInt();
		if (acc == yourAcc) {
			System.out.println("이체할 금액을 입력하세요: ");
			int money = scan.nextInt();
			if (myMoney >= money) {
				System.out.println("통장에 남은 금액: " + (yourMoney + money) + "원");
			}
			else {
				System.out.println("이체할 수 없습니다.");
				}
		}
		else {
			System.out.println("이체할 수 없습니다.");
			}
		scan.close();
	}
}
		
		


	



