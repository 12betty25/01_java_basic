package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) { 
				System.out.println("얼마를 입금하시겠습니까? ");
				int moveMoney = scan.nextInt();
				myMoney += moveMoney;
				System.out.println("남은 잔액: " + myMoney);
			}
			else if (selectMenu == 2) {
				System.out.println("얼마를 출금하시겠습니까? ");
				int moveMoney = scan.nextInt();
				myMoney = myMoney - moveMoney;
				
				if (myMoney >= moveMoney) {
					System.out.println("남은 잔액: " + myMoney);
				}
				else {
					System.out.println("잔액이 부족합니다.");
				}
			}
			else if (selectMenu == 3) {
				System.out.println("이체할 계좌를 입력해주세요: ");
				int inputAcc = scan.nextInt();
				
				if (inputAcc == yourAcc) {
					System.out.println("이체할 금액을 입력해주세요: ");
					int moveMoney = scan.nextInt();
					
					
					if (myMoney >= moveMoney) {
						yourMoney += moveMoney; 
						myMoney = myMoney - moveMoney;
						System.out.println("이체된 계좌의 잔액: " + yourMoney);
					}
					else {
						System.out.println("잔액이 부족합니다.");
					}	
				}
				else {
					System.out.println("잘못된 계좌입니다.");
				}
			}
			else if (selectMenu == 4) {
				System.out.println("myAcc 잔액" + myMoney + "원");
				System.out.println("yourAcc 잔액" + yourMoney + "원");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
