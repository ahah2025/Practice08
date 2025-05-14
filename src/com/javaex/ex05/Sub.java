package com.javaex.ex05;

public class Sub { //빼기

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    }

    public int calculate() {
    	return a-b;
    }

	@Override
	public String toString() {
		return "Sub [a=" + a + ", b=" + b + "]";
	}

    
}
