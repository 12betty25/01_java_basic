package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		
		System.out.println("원하시는 메뉴 번호를 입력하세요: ");
		int menuNum = scan.nextInt();
		System.out.println("현금을 입력하세요: ");
		int price = scan.nextInt();
		
		if (menuNum == 1) {
			if (price == price1) {
				System.out.println("주문이 완료되었습니다.");
			}
			if (price != price1) {
				System.out.println("현금이 부족합니다.");
			}
		}
		if (menuNum == 2) {
			if (price == price2) {
				System.out.println("주문이 완료되었습니다.");
			}
			if (price != price2) {
				System.out.println("현금이 부족합니다.");
			}
		}
		
		if (menuNum == 3) {
			if (price == price3) {
				System.out.println("주문이 완료되었습니다.");
			}
			if (price != price3) {
				System.out.println("현금이 부족합니다.");
			}
		}
	}

}
