package com.abc;
class Animal1{
	public void display() {
		System.out.println("i am animal class");
	}
}
class Dog1 extends Animal1{
	public void display() {
		System.out.println("i am dog class");
	}
	public void printmsg() {
		display();
		super.display();
	}
}

public class Day3_4 {
	public static void main(String args[]) {
		Dog1 d1= new Dog1();
		d1.printmsg();
		
	}

}
