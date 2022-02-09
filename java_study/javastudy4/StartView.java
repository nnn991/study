package view;

import controller.Controller;


// 시작화면에서 컨트롤러의 reqRes() 메소드를 통해서 원하는 정보를 얻기 위한 첫 시도가 제공된다.
public class StartView {

	
	/* client가 1로 요청시 고객 한명 정보 요청으로 간주
	 * 			2로 요청시 고객 모든 정보 요청으로 간주
	 */
		public static void main(String[] args) {
			System.out.println("*** 고객 한명 정보 요청 ***");
			Controller.reqRes(1);
			
			System.out.println("*** 모든 고객 정보 요청 ***");
			Controller.reqRes(2);

			System.out.println("*** 잘못된 정보 요청 ***");
			Controller.reqRes(3);
		}
		
// 최종 결과(EndView)에 호출되는 id와 grade 정보를 이용해서 결과를 표기한 후, 메소드가 종료된다. 
}
