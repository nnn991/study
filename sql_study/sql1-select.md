---
title:  "SQL(1) - select"
excerpt: "SQL 기본 문법 중 select에 대해서 공부해봅시다!"

categories: sqlstudy
tags:
  - [sql, sqlplus, SCOTT]

toc: true
toc_sticky: true
 
date: 2022-01-28
last_modified_at: 2022-01-28
---
## 기본 문법
1. select 문장 기본 syntax  
select 절  
from 절;  

2. 정렬 포함 기본 syntax  
select 절  
from 절  
order by 절;  

3. 조건절 포함 기본 syntax  
select 절  
from 절  
where 절;  

4. 참고  
dual table : 잉여 table이며 데이터가 존재하지 않는 table  
- syntax적으로 from절이 반드시 필요하기 때문에 사용하기도 한다.  
- 예시) 시스템의 현재 시간 검색 : select sysdate from dual;  

5. oracle의 SCOTT을 이용한 실습  

- 1. 해당 계정이 사용 가능한 모든 table 검색  
-> select * from tab;  
  
- 2. emp의 구조 검색  
-> desc emp;  
  
- 3. emp의 사번, 이름만 검색
-> select empno, ename from emp;

- 4. 중복된 부서 번호 제거 및 검색
-> select distinct deptno from emp;

- 5. 부서 번호 오름차순 정렬(order by)  
  - 오름차순 : asc / 내림차순 : desc  
-> select distinct deptno from emp order by deptno asc;  
  - 실행 순서 : from -> select -> order by  
    
- 6. null도 연산이 가능한가?  
  - null값과 연산시 모든 데이터는 null이 나온다  
  - 해결책 : null을 0값으로 대체  
  - 모든 db는 지원하는 내장 함수를 가지고 있다  
  - oracle에서는 null -> 숫자값으로 대체하는 함수 : nvl(null 보유 컬럼명, 대체값)  
-> select ename as 사원, comm as 상여금, sal as 월급, sal * 12+nvl(comm,0) as 연봉 from emp;  
  
*** 조건식 ***
  
- 7. comm이 null인 사원들의 이름과 comm만 검색  
  - where 절 : 조건식 의미  
-> select ename, comm from emp where comm is null;  

- 8. comm이 null이 아닌 사원들의 이름과 comm만 검색  
  - 아니다 라는 부정 연산자 : not  
-> select ename, comm from emp where comm is not null;  

- 9. 사원명이 smith인 사원의 이름과 사번만 검색  
  - db에선 동등비교 연산자로 '=' 사용  
  - 데이터의 대소문자는 중요  
-> select ename as 사원이름, empno as 사번 from emp where ename = 'SMITH';  
  
*** 종합 ***
  
- 10. 부서번호가 10번인 사원의 이름, 사번, 부서번호 검색 사번은 내림차순으로 정리  
-> select ename, empno, deptno from emp where deptno = 10 order by empno desc;  

*** 추가 기능 ***  
  
- 날짜 타입의 범위를 기준으로 검색  
  - 범위비교시 연사자 : between ~ and  
-> select ename, empno, hiredate from emp where hiredate between '80/12/17' and '81/02/22';  

- 검색시 포함된 모든 데이터를 검색하는 기술  
  - 연산자 : Like  
  - % : 철자 개수 무관하게 검색 / _ : 철자 개수 의미  
-> select ename from emp where ename like 'S%';  
-> select ename from emp where ename like 'S_';  














