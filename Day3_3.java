package com.abc;
class Animals{
	protected void display() {
		System.out.println("i am animal class");
	}
}
class Dogs extends Animals{
	public void display() {
		System.out.println("i am dog class");
	}
}

public class Day3_3 {
	public static void main(String args[]) {
		Dogs d1= new Dogs();
		d1.display();
		
	}

}
