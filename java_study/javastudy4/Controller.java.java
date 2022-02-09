package controller;

import model.CustomerDTO; // DTO에 저장된 정보를 가져온다.
import model.Model;		  // Model에서의 고객 정보 이용.
import view.EndView;	  // EndView에서의 print method를 사용한다.

public class Controller {
	
	// 요청 1 - 한명 고객 정보 제공
	// 요청 2 - 모든 고객 정보 제공
	// 1,2가 아니라면 - 잘못된 요청
	/*
	 * 정수비교 연산자(동등비교 연산자) : ==
	 */
	public static void reqRes(int flag) {
		if(flag == 1) {
//			CustomerDTO c = Model.getCustomer();
//			EndView.print(c);
			EndView.print(Model.getCustomer());
			
		}else if(flag == 2) {
			/*
			 * EndView.printAll(Model.getCustomers()); 실행 순서
			 * Model.getCustomers()
			 * 	-> EndView.printAll()
			 * 		-> ;
			 */
			EndView.printAll(Model.getCustomers());
		}else {
			EndView.printMsg("잘못된 요청입니다.");
		}
		
	}
}
// 리퀘스트 및 리스폰스를 담당하는 메소드이므로 정보를 받아오고 출력까지 명령한다.

