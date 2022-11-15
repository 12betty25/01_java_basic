package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx03 {

	public static void main(String[] args) {

		/*
		 * 
		 *  # 이스케이프 문자 ( escape sequence ) 
		 * 
		 * 	1) \n : 줄바꿈
		 *  2) \t : tab
		 *  3) \" : 문자 자체 " (문법x)
		 * 
		 */
		System.out.println("안녕\n하세요");
		System.out.println("안\t녕\t하\t세\t요");
		System.out.println("\"안녕하세요\""); 		//"안녕하세요"
		System.out.println();
		
		 /* 
		 *  서식 문자 출력
		 *  
		 *  1) %d : 정수
		 *  2) %f : 실수
		 *  3) %c : 단일 문자
		 *  4) %s : 문자열
		 *  
		 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
		 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
		 *     %.3f : 소수점 3자리 까지 출력(반올림)
		 */
		System.out.printf("%d\n", 10);
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.1f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		System.out.printf("%.3f\n", 3.14);

		System.out.printf("%c\n", '#');
		System.out.printf("%s\n", "글자");
		System.out.printf("무조건 글자만");
		
		System.out.printf("총점: %d, 평균: %.1f\n" , 290 , 290 / 3.0);
		System.out.printf("이름: %s, 나이: %d, 총점: %d, 평균: %.1f\n", "제임스 고슬링", 20, 398, 398 / 4.0);
		
		System.out.println();
		
		
		/*
		 * 
		 *  # Date
		 *  
		 * 	[1] 날짜 및 시간 출력 서식 지정 방법
		 *  	. 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 입력하는 그대로 출력된다.
		 *  	. Date date = new Date();
		 *  	. SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
		 *  [2] 날짜 및 시간 서식 적용 방법
		 *  	. sdf.format(date);
		 *  [3] 날짜 및 시작 출력 서식 문자의 종류
		 *  	. 구글에서 "simpledateformat 날짜 형식" 라고 검색하기
		 *  
		 *  
		 *  # System.currentTimeMillis()
		 *   
		* 	- 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		*   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long로 처리해야 한다.
		*   
		*/
		
		Date date = new Date();	  //자바에서 제공하는 클래스 - 현재 시간을 제공해주는 타임 스탬프
		System.out.println(date); // Tue Nov 15 15:26:16 KST 2022
		
		long time = System.currentTimeMillis();	//long은 int 대신 - 큰 범위의 숫자 (43억 이상)
		System.out.println(time); 				//1668493760150
		
		System.out.println();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");	//MM은 무조건 대문자 (소문자면 분으로 나옴) 
		String date1 = sdf1.format(date);
		String date2 = sdf1.format(time);
		System.out.println("date1: " + date1);
		System.out.println("date2: " + date2);
		System.out.println();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");	//MM은 무조건 대문자 (소문자면 분으로 나옴) 
		String date3 = sdf2.format(date);
		String date4 = sdf2.format(time);
		System.out.println("date3: " + date3);
		System.out.println("date4: " + date4);
		System.out.println();
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");	//MM은 무조건 대문자 (소문자면 분 (시간)) 
		String date5 = sdf3.format(date);
		String date6 = sdf3.format(time);
		System.out.println("date5: " + date5);
		System.out.println("date6: " + date6);
		System.out.println();
		
		// DecimalFormat df = new DecimalFormat("숫자 서식");
		// 숫자 서식은 무조건 "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여준다.
		int salary1 = 1000000000;
		long salary2 = 10000000000l; //43억 이상 쓸 거면 long 타입을 사용하고 숫자 뒤에 'l'을 붙인다
		long salary3 = 1000000000000000000l;
		
		DecimalFormat df = new DecimalFormat("#,##0");	//,찍어 숫자를 출력
		String number1 = df.format(salary1);
		System.out.println("number1: " + number1);
		System.out.println("number2: $" + df.format(salary2));
		System.out.println("number3: " + df.format(salary3) + "원");
		
	}

}
