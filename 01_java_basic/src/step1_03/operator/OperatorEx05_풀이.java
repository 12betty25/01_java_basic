package step1_03.operator;

//2002-09-29 17:05 ~ 
public class OperatorEx05_풀이 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면
        int score = 30;
        System.out.println(score >= 60);
        
        
        //문제1) 15가 3의 배수이면
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        
        int num = 15;
        System.out.println((num % 3) == 0);
        
        //문제2) 100이 짝수이면
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수
        
        int hundred = 100;
        System.out.println((hundred % 2) == 0);


        
        //문제3) 1000원짜리 지폐가 3장 이상이면
        int money = 178600;
        
        System.out.println((money / 1000) >= 3);
        

	}

}
