// Program to demonstrate final variables
package com.tnsif.daysix.usingfinal;

public class FinalVariable {

	// Final instance variable - must be initialized
	final int x = 100;

	// Static blank final variable - initialized in static block
	final static int Y;

	// Final static variable - initialized at declaration
	final static int Z = 10;

	// Static block to initialize Y
	static {
		Y = 20;  // ✅ allowed because it's the first and only assignment
		System.out.println("Static Block -> Value of Y: " + Y);
	}

	// Instance method
	void change() {
		
		System.out.println("Inside change() method: final variables cannot be modified.");
	}

	@Override
	public String toString() {
		return "FinalVariable [x = " + x + ", Y = " + Y + ", Z = " + Z + "]";
	}

	// Main method to test the class
	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		System.out.println(obj); // Will print x, Y, Z values
		obj.change();            // Will show that final vars cannot be changed
	}
}
