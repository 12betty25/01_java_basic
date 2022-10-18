package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("원하시는 ID를 입력해주세요 : ");
		dbId = scan.nextInt(); //덮어쓰는 거니까 int 불필요
		System.out.println("원하시는 PW를 입력해주세요 : ");
		dbPw = scan.nextInt();
		
		System.out.println("ID를 입력하세요 : ");
		int Id = scan.nextInt();
		System.out.println("PW를 입력하세요 : ");
		int Pw = scan.nextInt();
		
		if (Id == dbId && Pw == dbPw) {
			System.out.println("로그인 성공");
		}
		
		if (Id != dbId || Pw != dbPw) {
			System.out.println("로그인 실패");
		}

		
		
		
	}

}
