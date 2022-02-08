package com.abc;
class Animal2{
	Animal2(){
		System.out.println("i am animal class");
		
	}
	Animal2(String type){
		System.out.println("Type"+ type);
		
	}
}
class Dog2 extends Animal2{
	Dog2(){
		super("Animal2");
		System.out.println("i am dog");
		
	}
	
}

public class Day3_5 {
	public static void main(String args[]) {
		Dog2 d1=new Dog2();
		
	}

}
