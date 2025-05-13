package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Add add = new Add();
    
    	Scanner sc = new Scanner(System.in);
    	String str;
    	
    	System.out.println(">> ");
    	str = sc.nextLine();
    	
    	if(str.split("+")) {
    		System.out.println();
    	}
    	Integer strInt = Integer.parseInt(str);    	
    	
    	
    	
    	sc.close(); //x
    }
}
