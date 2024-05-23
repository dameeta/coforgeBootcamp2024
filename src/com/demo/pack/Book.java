package com.demo.pack;

import java.util.Scanner;

public class Book {
	 int id;
	String title;
	double price;
public static void main(String [] args)
{ Book bobj=new Book();
bobj.id=889;
bobj.title="The Train";
bobj.price=567.45;
System.out.println(bobj.id);
System.out.println(bobj.title);
System.out.println(bobj.price);
System.out.println("Printing the user input..");
Scanner scanner=new Scanner(System.in);
bobj.id=scanner.nextInt();
System.out.println(" ");
bobj.title=scanner.next();
System.out.println(" ");
bobj.price=scanner.nextDouble();
System.out.println(bobj.id);
System.out.printf("The book title is %s\n", bobj.title);
System.out.printf("The book price is %f",bobj.price);
	
}
}
