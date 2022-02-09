package model;

import lombok.AllArgsConstructor;
import lombok.Getter;	// 정보를 가져오는 라이브러리
import lombok.NoArgsConstructor;
import lombok.Setter;	// 가져온 정보를 수정하는 라이브러리
import lombok.ToString;


// lombok을 이용해서 코드를 단순화 시킨다.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {
	
	// 초기값 설정
	private String id;
	private int pw;
	private char grade; //g(gold), s(silver) 두 등급만 가정
	private String job;
	
	//grade값에 유효한 값만 저장 가능한 조건식 적용(유효성 적용)
	//유효한 데이터만 저장 가능하게 하는 rule, 절대 타입만 맞다고 해서 대입 가능한 상황은 금지
	//변수를 외부에서 호출 불가능하게 막아놓고 유효성 검증 코드로 검증 후에만 대입
	//개발 관점 : 변수를 외부에서 차단(private) / 유효성 코드로 검증 메소드는 제한 없이 허용(public)
	
	// 등급 중 'g', 's'등급의 고객정보만 가져오는 것을 나타내기 위한 조건문.
	public void setGrade(char grade) {
		if(grade == 'g' || grade == 's') {
			this.grade = grade;
		}else {
			System.out.println("무효한 등급");
		}
		
	}
}

// '' -> 단일 문자     "" -> 2개 이상 문자