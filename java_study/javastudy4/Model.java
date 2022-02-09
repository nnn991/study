package model;

public class Model {

	// controller의 요청으로 한 명의 정보를 db로 부터 검색해서 CustomerDTO 생성해 반환
	
	public static CustomerDTO getCustomer() {
		// 객체 생성
		// setXxx() 메소드로 값 저장
		// id : encore , pw : 11, grade : g
		// 반환
		CustomerDTO c1 = new CustomerDTO();
		
		c1.setId("encore"); // id 정보
		c1.setPw(11);		// pw 정보
		c1.setGrade('g');	// 등급 정보
		
		return c1;
	}
	
	// 고객들을 모두 반환
	public static CustomerDTO[] getCustomers() {
		
		CustomerDTO[] c = {new CustomerDTO("id1", 11, 'g', "개발"), 
						   new CustomerDTO("id2", 22, 's', "기획")};
		
		return c;
	}
	
	
}
