package edu.kh.control.loop;

import java.util.Scanner;

public class forExample {
	Scanner sc = new Scanner(System.in);
	/* for문
	 * 끝이 정해져 있는 반복문
	 * 조건에 따라 한번도 수행되지 않을 수 있다
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식){
	 * 		반복 수행할 코드
	 * }
	 * 
	 * - 초기식: for문을 제어하는 용도의 변수 선언
	 * - 조건식: for문의 반복 여부를 지정하는 식(다음 반복 진행해?)
	 * 			보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			for문이 끝날 때 마다 증가 or 감소 시켜
	 * 			조건식의 결과를 변하게 하는 식
	 * 
	 */
	
	public void ex1() {
		// 1 ~ 10 까지 출력하기
		// 조건식이 ture 일 때 수행함
		
		for(int i = 1; i <= 10; i++) {
		   //초기식;     조건식	   증감식
			System.out.println(i);
			//반복 수행 될 코드
		}
	}
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		// 3,4,5,6,7
		
		for(int i = 3; i < 8; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.print("숫자를 입력하시오: " );
		
		int a = sc.nextInt();
		
		
		for(int i = 1; i <= a; i++) {
			System.out.println("출력 : " + i);
		}
	}
	
	
	public void ex4() {
		// 1.0 부터 입력받은 실수 까지 0.5씩 증가하며 출력
		System.out.print("숫자를 입력하시오: ");
		
		double a = sc.nextDouble();
		
		for(double i = 1.0; i <= a; i+=0.5) {
			System.out.println("출력 : " + i);
		}
		
		
	
	}
	
	public void ex7() {
		// 영어 알파벳 A ~ Z 한주롤 출력
		// ** char 자료형은 oo코드
		// ABCE...
		
		for(int i = 'A'; i <= 'Z'; i+=2) {
			System.out.print((char) i);
		}	
	}
	
	public void ex8() {
		// 1 ~ 10 까지 모든 정수의 합 구하기
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 공간을 만들어줌
					 // 0으로 시작하는 이유: 아무것도 더하지 않으므로 정확히 값 도출
		for(int i = 1; i <= 10; i++) {
			sum+=i;
		}System.out.println(sum);
	}
	
	public void ex9() {
		// 1 ~ 20까지 1씩 증가 출력
		// 단, 5의 배수에 ()를 붙여서 출력
		// ex) 1,2,3,4,(5),6,7,8,9,(10)...
		
		for(int i = 1; i <= 20; i++) {
			if(i % 5 ==0) {
				System.out.print(" ("+ i + ") ");
		}else {
			System.out.print(i + " ");
		}
		}
	}
	// 중첩 반복문
	public void ex10() {
		// 구구단 출력하기
		
		for(int dan = 2; dan <= 9; dan++) { // 2 ~ 9까지 차례대로 증가
			for(int su =1; su <= 9; su++) { // 1 ~ 9까지 차례대로 증가
				System.out.printf("%2d * %2d = %2d", dan, su, dan * su);
			}
			System.out.println();
		}
		
	}
	
	public void ex11() {
		// 구구단 역순 출력
		
		for(int dan = 9; dan >=2; dan--) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%2d * %2d = %2d", dan, su, dan * su);
			}
			System.out.println();
		}	
	}
	public void ex12() {
		
	}
	public void ex13() {
		for(int a = 1; a <= 4; a++) { 
			for(int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println("");
		}
		System.out.println("===============");
		
		for(int x = 4; x >= 1; x--) {
			for(int i = x; i >= 1; i--) {
				System.out.print(i);	
			}
			System.out.println();
		}
}
}


