package com.javaex.ex05;

public class Mul { //곱하기

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    }

    public int calculate() {
    	return a*b;
    }

	@Override
	public String toString() {
		return "Mul [a=" + a + ", b=" + b + "]";
	}

    
}
