package view;

import model.CustomerDTO;	//DTO에서 고객의 정보들 중 걸리진 결과를 불러온다.

public class EndView {

	public static void print(CustomerDTO c) {
		System.out.println(c.getId() + " " + c.getGrade()); // 최종적으로 id와 등급의 결과를 표시한다.
	}

	
	//? 모든 고객 정보를 반복문을 사용해서 출력
	// forEach / println() 참조변수값 출력시 toString() 자동 호출
	
	public static void printAll(CustomerDTO[] all) {
		for(CustomerDTO i : all) {
			System.out.println(i.toString()); // 그냥 i도 가능
		}
	}


	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
