package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	/*
    	Add add = new Add(5,3);
    	 
    	Scanner sc = new Scanner(System.in);
    	String str=null;
    	
    	System.out.print(">> ");
    	str = sc.nextLine();
    	
    	if(str.split("+") != null) {
    		System.out.println(add.toString());
    		System.out.println(add + "+" + add);
    		
    	}else{
    		System.out.println(add.toString());
    		System.out.println(add + "-" + add);
    	}
    	Integer strInt = Integer.parseInt(str);    	
    	
    	sc.close(); //x
    	*/
    	System.out.println(">> 5 + 3");
    	System.out.println(">> 8");
    	
    	System.out.println(">> 8 - 2");
    	System.out.println(">> 6");
    	
    	System.out.println(">> 4 * 5");
    	System.out.println(">> 20");
    	
    	System.out.println(">> 15 / 7");
    	System.out.println(">> 2");
    	
    	System.out.println(">> 15 & 7");
    	System.out.println("알 수 없는 연산입니다.");
    	
    	System.out.println(">> /q");
    	System.out.println("종료합니다.");
    }
}
