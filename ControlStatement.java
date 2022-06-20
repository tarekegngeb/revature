package com.revature.tarekegn.assignment1;

public class ControlStatement {
	public static void main(String[] args) {
		int number = 5;
		if(number > 0) {
			System.out.println("you are right!");
		}else {
			System.out.println("you are wrong!");
		}
		System.out.println();
		// while loop
		while(number < 10) {
			
			System.out.println(number);
			number++;
		}
		System.out.println();
		//do - while loop
		do {
			System.out.println(number);
			number++;
		}while(number < 1 );
			
		System.out.println();
		// for loop
		for(int i = 0; i<=number; i++) {
			System.out.println(i);
			
		}
		System.out.println();
		// enhanced for loop
		String[] names = {"Josh", "August", "Austin"};
		for(String name : names) {
			System.out.println(name);
			
		}
		System.out.println();
		//Switch statement
		
		switch(number) {
		case 0:
			System.out.println(6);
			break;
		case 1:
			System.out.println(5);
			break;
		case 2:
			System.out.println(11);
			break;
			default:
				System.out.println(number);
		
		
			
		}
		System.out.println();
		//break
		number = 10;
        while(number < 15) {
			if(number == 12)
				break;
			
			System.out.println(number);
			number++;
		}
        System.out.println();
		//continue
        number = 10;
        while(number < 15) {
			if(number == 12)
				continue;
			
			System.out.println(number);
			number++;
		}
		
	}

}
