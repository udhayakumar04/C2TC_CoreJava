package com.tnsif.dayseven.polymorphism.overloading;

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
	Addition a = new Addition();
	a.add();
	System.out.println(a.add(6));
	System.out.println(a.add(6.7));
	System.out.println(a.add(3,5));
	a.show( 4, " uk");
	a.show("uk ", 5);
	}
}
