package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //p1(2,3) 과 p2(2,3)가 같냐?      false
		System.out.println(p2 == p3); //p2(2,3) 과 p3(5,3) 같냐?        false
		System.out.println(p3 == p4); //p3(5, 3)과 p4(=p1)2,3 같냐?     false	
		System.out.println(p4 == p1); //p4(=p1)2,3 같냐?  				true		
		System.out.println(p1.equals(p2)); //p1과 p2가 같냐?    		false
		System.out.println(p4.equals(p1)); //p4와 p1 같냐? 				true
	}

}


