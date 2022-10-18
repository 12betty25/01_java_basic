package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if (identifier == -1) {
					System.out.println("ID 입력: ");
					int id = scan.nextInt();
					System.out.println("PW 입력: ");
					int pw = scan.nextInt();
					
					if (dbAcc1 == id && dbPw1 == pw) {
						identifier = 1;
						System.out.println("로그인 성공!");
					}
					else if (dbAcc2 == id && dbPw2 == pw) {
						identifier = 2;
						System.out.println("로그인 성공!");
					}
					else {
						System.out.println("계좌를 확인해주세요. ");
					}
				}
				else {
					System.out.println("이미 로그인 되었습니다.");
				}
			}
			else if (sel == 2) {
				if (identifier != -1) {
					identifier = -1;
					System.out.println("로그아웃 되었습니다.");
				}
				else {
					System.out.println("로그인이 되어있지 않습니다.");
				}
			}
			else if (sel == 3) {
				if (identifier != -1 ) {
					System.out.println("입금하실 금액을 입력해주세요: ");
					int moveMoney = scan.nextInt();
					
					if (identifier == 1) {
						dbMoney1 = dbMoney1 + moveMoney;
					}
					else if (identifier == 2) {
						dbMoney2 = dbMoney2 + moveMoney;
					}
					System.out.println("입금을 완료했습니다.");
				}
				else {
					System.out.println("로그인 해주세요!");
				}
			}
			//출금
			else if (sel == 4) {
				
				if (identifier != -1) {
					System.out.println("출금하실 금액을 입력해주세요: ");
					int moveMoney = scan.nextInt();
					
					if (identifier == 1) {
						if(moveMoney <= dbMoney1) {
							dbMoney1 -= moveMoney; 
							System.out.println("출금 완료");
						}
					}
					else if (identifier == 2) {
						if(moveMoney <= dbMoney2) {
							dbMoney2 -= moveMoney; 
							System.out.println("출금 완료");
							}
						}
					else {
						System.out.println("계좌 잔액이 부족합니다.");
					}
				}
				else {
					System.out.println("로그인을 해주세요!");
				}
			}
			
			//이체
			else if (sel == 5) {
				System.out.println("이체하실 계좌를 입력해주세요: ");
				int acc = scan.nextInt();
				
				if (acc == dbAcc2) {
					System.out.println("이체하실 금액을 입력해주세요: ");
					int moveMoney = scan.nextInt();
					if (identifier == 1) {
						if (moveMoney <= dbMoney1) {
							
						}
					}
				}
				
			}
			else if (sel == 6) {}
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
