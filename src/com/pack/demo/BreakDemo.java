package com.pack.demo;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("iteration" +i);
		}

	}

}