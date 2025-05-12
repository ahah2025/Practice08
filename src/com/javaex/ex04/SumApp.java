package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String sNum1 = ""+140;
		System.out.println(sNum1.equals(sum));
		System.out.println("합:" + 140);
		
		sc.close();
	}

}
/*
숫자를 공백으로 구분해서 입력하세요
1 2 3 4
false
합:140

99 1 2 10 18 10
false
합:140

1 11 21 31 2 12 22 32
false
합:140
*/