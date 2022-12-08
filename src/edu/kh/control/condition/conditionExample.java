package edu.kh.control.condition;

import java.util.Scanner;

public class conditionExample {
	public void ex1() {
		// if문
		// -조건식이 true 일 때만 내부 코드 수행
		/*
		 [작성법]
		 if(조건식) {
		 	조건식이 true 일 떄 수행 될 코드
		 }
		 
		 if - else문
		 - 조건식 결과가 true면 if문
		 	false면 else 구문이 실행됨.
		 	
		 [작성법]
		 if(조건식){
		 	조건식이 t일 때 수행될 코드
		 } else{
		 	조건식이 f일 때 수행될 코드
		 }
		 
		*/ 	
		 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력 된 정수가 양수인지 검사
		if(input > 0 ) {
			System.out.println("양수 입니다.");
		} else {
			System.out.println("양수가 아니네용");
		}
		
		/*
		if(input <= 0) {
			System.out.println("양수가 아니다.");
			
			
		}*/
		
	}
	
	public void ex2() {
		//홀짝 검사
		//입력 받은 값이 홀 or 짝 출력
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("값 입력 : ");
		
		int input2 = sc.nextInt();
		
		if(input2 % 2 == 0) {
			System.out.println("짝수 입니다.");
			
		} else {
			System.out.println("홀수 입니다.");
		}
		
	}
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하시오 : ");
		int month = sc.nextInt();
		String result;
		
		
		
		switch(month) {
		case 1 : case 2 : case 12 : result = "겨울"; break; 
		case 3 : case 4 : case 5 : result = "봄"; break;
		case 6 : case 7 : case 8 : result = "여름"; break;
		case 9 : case 10 : case 11: result = "가을"; break;
		default : result = "계절이 아닙니다.";
		}
		System.out.println(result);
		
		
		
		
	}

	public void ex4() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다." 출력
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오. : ");
		int input = sc.nextInt();
		
		if(input <= 13) {
			System.out.println("어린이 입니다.");
		}else if(input > 13 && input <= 19) {
			System.out.println("청소년 입니다.");
			
		}else {
			System.out.println("성인 입니다.");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오. : " );
		int age = sc.nextInt();
		String result;
		
		if(age <= 13) {
			result = "어린이입니다.";
		}else if(age <= 19) {
			result = "청소년 입니다.";
		}else {
			result = "성인입니다.";
		}
		System.out.println(result);
		
		
	}
	
	public void ex5() {
		// 점수 (100점 만점)을 입력 받아
		/* 
		 90점 이상: A 
		 80점 이상 90점 미만 : B
		 70점 이상 80점 미만 : C
		 60점 이상 70점 미만 : D
		 60점 미만 : F
		 0점 미만, 100 초과 : "잘못 입력"
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		
		String result;
		
		
		if(score < 0 || score > 100) {
			result = "잘못 입력";	
		}else if(score >= 90) {
			result = "A";
			
		}else if(score >= 80) {
			result = "B";
			
		}else if(score >= 70) {
			result = "C";
			
		}else if(score >= 60) {
			result = "D";
			
		}else {
			result = "F";
		}
		
		System.out.println(result);
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: " );
		int input = sc.nextInt();
		
		String grade;
		
		
		if(input >= 100) {
			grade = "A";
		}else if(input >= 80 && input < 90) {
			grade = "B";
			
		}else if(input >= 70 && input < 80) {
			grade = "C";
			
		}else if(input >= 60 && input < 70) {
			grade = "D";
					
		}else if(input < 60) {
			grade = "F";
		}
		else {
			grade = "잘못 입력";
			
		} 
		System.out.println(grade);
		*/
	}
	
	public void ex6() {

		
		// 놀이 기구 탑승 제한 검사
		// 조건 = 나이 12세 이상
		//	   - 키 140.0cm 이상
		// 나이를 0 ~ 100세 사이로 입력하지 않은 경우 : "나이 잘못 입력"
		// 키를 0 ~ 250.0cm 사이로 입력 x : "키 잘못 입력"
		// - > 입력 되자마자 검사를 진행하여 잘못된 경우 프로그램 종료
		
		// 나이 O , 키 X : "나이 ㄱㅊ, 키 ㄴㄴ"
		// 나이 X,  키 O : "키 ㄱㅊ, 나이 ㄴㄴ"
		// 나이 X,  키 X : "나이, 키 ㄴㄴ"
		// 나이 O , 키 O : 탑승 하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력 하시오: ");
		
		int age = sc.nextInt();
		
		String result; // 결과 담을 변수 선언 --> 초기화 안한 상태
		
		if(age < 0 || age > 100) {
			result = "나이 잘못 입력! ";
			
		} else{
			
			System.out.print("키를 입력 하시오: " );
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250) {
				result = "키 잘못 입력! ";	
			}else { // 키 잘 입력 한 경우
			       if(age < 12 && height >=140.0) {
					result = "나이는 적절치 않음, 키는 적절함!";
			       }else if(age >= 12 && height < 140.0) {
					result = "나이는 적절함 키는 적절치 않음!";
		           }else if(age < 12 && height < 140.0) {
					result = "나이와 키 모두 적절치 않음!";
			       }else {
					result = "탑승 가능";
			       }
		    }
		  }
		System.out.println(result);
	}

	public void ex7() {
		// 연산자 (+. -, * / %)
		// 정수 1 ->5
		// 정수 2 ->10
		// 연산자 : *
		// 계산결과 : 5 * 10 =50
		Scanner sc = new Scanner(System.in);
		
		System.out.print("갑을 입력하시오: ");
		int num = sc.nextInt();
		
		System.out.println("두번째 값을 입력하시오: ");
		int num1 = sc.nextInt();
		
		System.out.print("연산자를 입력하시오: ");
		String op = sc.next();
		
		
		
		
		
		
	}


}



