package step1_06.loop;


// # 삼각형 그리기

public class LoopEx28_풀이 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {		//가로
			//           (0,1,2)
			for (int j = 0; j < 3; j++) {	//세로 세개가 나오고 j++후에 i++. j = 1, i = 1.................... #을 세번 (0,1,2)까지 실행하고 메인 for문으로 다시 들어갈 때 j=0부터 다시 실행
				System.out.print("#");
			}
			System.out.println();			//이 문장을 써서 가로로 만듦
		}
		System.out.println();
		
		
		for (int j = 0; j < 3; j++) {	//세로
			System.out.print("#");
		}
		System.out.println();
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */

		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */

		
		
	}
}
