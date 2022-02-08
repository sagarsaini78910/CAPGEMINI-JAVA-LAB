package com.abc;
class Animal3{
	public void eat() {
		System.out.println("i can eat");
	}
}
class cat extends Animal3{
	public void eat() {
		super.eat();
		System.out.println("i eat cat food");
	}
	public void sound() {
		System.out.println("i can meow");
	}
}

public class Day3_6 {
	public static void main(String args[]) {
		cat c1 = new cat();
		Animal3 a1 = new Animal3();
		a1.eat();
		c1.eat();
		c1.sound();
		
		
	}

}
