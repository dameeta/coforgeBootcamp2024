package com.pack.demo;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 98754, rev=0,rem=0;
while(num!=0) {
	rem = num%10;
	rev=rev*10 +rem;
	num=num/10;
}
System.out.println("reverse:" +rev);
	}

}
