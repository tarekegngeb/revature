package com.revature.tarekegn.assignment1;

public class TestAssignment1 {
public static void main(String[] args) {
		UsingOneClassAssignment assignment = new UsingOneClassAssignment();
		System.out.println("The sum of two numbers is: "+assignment.sum(10, 20));
		System.out.println("Difference of two numbers is: "+assignment.sub(10, 20));
		System.out.println("Multiply of two numbers is: "+assignment.multiply(10, 20));
		System.out.println("Division of two numbers is: "+assignment.division(10.0, 20.0));
	}

}
