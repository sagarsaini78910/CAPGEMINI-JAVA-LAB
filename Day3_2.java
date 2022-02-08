package com.abc;
class Animal{
	public void displayinfo() {
		System.out.println("i am animal class");
	}
	
}
class Dog extends Animal{
	public void displayinfo() {
		super.displayinfo();
		System.out.println("i am dog class");
	}
}

public class Day3_2 {
	public static void main(String args[]) {
		Dog d1= new Dog();
		d1.displayinfo();
		
		
	}

}
