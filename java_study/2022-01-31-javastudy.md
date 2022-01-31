---
title:  "java(1) - 기본 문법"
excerpt: "java의 기본 문법에 대해서 공부해봅시다!"

categories: javastudy
tags:
  - [javastudy, java]

toc: true
toc_sticky: true
 
date: 2022-01-31
last_modified_at: 2022-01-31
---

## java의 구조
  
1. 소스 구조  
    1. 확장자 - *.java  
    2. java 소스의 구성  
    package 선언구  
    - 현 소스의 저장 경로  
    - 패키지명 : 디렉토리 구조 및 이름  
          
        import 선언구  
        - 다른 패키지의 프로그램을 가져와서 사용하겠다는 의미  
          
        Class 이름{  
          
        ```  
         변수(데이터)  
         생성자(객체생성시에 호출되는 필수 구성 요소)  
         메소드(기능)  
          
        ```  
          
        }  
          
2. main()  
브라우저 없이 실행되는 일반 자바 프로그램의 시작점의 기능  
특별 기능의 정해진 메소드(스펙)  
public static void main(String[] args)  
  
## 문법
  
1. 변수  
타입 변수명;  
타입 변수명 = 값;  
  
2. 생성자  
클래스명([arguments]){  
[logic]  
}  
  
3. 메소드  
반환타입 메소드명([arguments]) {  
[logic]  
return 값;  
}  
반환타입이 없다면 void  
  

## 개념
  
1. 메소드 개발 권장 방식  
    1. 명명규칙(이름) : 소문자로 시작, 단 여러 단어가 조합시에는 조합된 단어들 첫 철자만 대문자  
    getName() / setName()  
    2. 메소드를 호출하는 관점에서 즉 사용자 관점에서 이름 선정 권장  
    3. 기능으로 메소드 이름 예시  
        - 사용자 관점(호출자)  
            1. 이름 정보 주세요  
                - 새로운 정보 제공 없이 존재하는 데이터값만 요청  
                - argument 불필요 / return 필수  
                - String getName(){  
                - ...  
                return "이름";  
                }  
            2. 개명했으니 이름 수정해 주세요  
                - 새로운 데이터 줄테니 이 정보로 변경  
                - argument 필수  
                - void (String newName){  
                이름값 수정  
                }  

2. 변수 구분  
    1. 타입에 따른 구분  
    - 기본타입(내장타입, built in, 8가지)  
    int i;  
    double d;  
  
    - 참조타입(객체 관리하는 참조 변수, 객체 타입, 앞글자가 대문자)  
        - class가 존재하는 범위에 한해서만 타입으로 사용 가능  
    String s;	API에 String.java 제공  
    L01Variable l;	L01Variable.java를 사용자 정의로 구성  
      
    2. 선언 위치에 따른 구분  
        1. 멤버 변수  
            - class {} 하위에 선언되는 모든 변수  
            - 객체 생성시에 객체 내부에 구성 요소로 생성되는 변수들  
            - 객체 생성시에 생성 및 객체가 메모리에서 소멸될 때 자동 삭제  
            - People의 name과 age 변수  
              
        2. 로컬 변수(temporary, automatic, stack)  
            - 생성자와 메소드 () 즉 argument 또는 {} 내부에 선언되는 변수들  
            - 생성자나 메소드 호출시에만 메모리에 생성되었다가 생성자와 메소드가 실행 종료시에 자동 소멸  