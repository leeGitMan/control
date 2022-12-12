package edu.kh.control.branch;

import java.util.Scanner;

public class branchExample {

	public void ex1() {
		// 1 ~ 10까지 1씩 증가하며 출력하는 반복문 작성 (for)
		// 단, 5를 출력하면 반복문을 멈춤 (if)
		for(int i = 1; i  <= 10; i++) {
			System.out.println(i + " ");
			if(i == 5) {
				break;
			}
		}
	}
	
	
	public void ex2() {
		// 0이 입력될 때 까지 모든 정수 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			//sum += input;
			
			if(input == 0) {
				break;
			}
			sum += input; // 누적
		}
		System.out.println("합계 : "  + sum);
	}

	public void ex3() {
		// 3의 배수 제외 하고 1~10까지 출력
		// break : 반복문을 바로 멈춤
		// continue : 다음 반복으로 넘어감
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
	
	}
	
	public void ex4() {
		// 1 ~ 100까지 1씩 증가
		// 단 5의 배수는 건너 뛰고
		// 증가하는 값이 40이 되었을 때 반복 멈춤
		for(int i = 1; i <= 100; i++) {
			
			if(i == 40) {
				break;
			}
			
			if( i % 5 == 0) {
				continue;
			}
			System.out.println(i);		
		}
	}
}


