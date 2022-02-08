package com.abc;

class Day3 {
	public void display() {
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
		}	
	}
	public void display(char symbol) {
		for (int i = 0; i < 10; i++) {
			System.out.println(symbol);
		}	
		
	}


	public static void main(String[] args) {
	    Day3 d1 = new Day3();
	    d1.display();
	    System.out.println("\n");
	    d1.display('#');
	  }

}
