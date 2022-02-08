package com.abc;
class Animal4{
	protected String name;
	protected void display() {
		System.out.println("i am an amimal");
	}
}
class Dog4 extends Animal4{
	public void getinfo() {
		System.out.println("my name " + name);
	}
}

public class Day3_7 {
	public static void main (String args[]) {
		Dog4 l1= new Dog4();
		l1.name="Rocky";
		l1.display();
		l1.getinfo();
		
	}

}
