package com.revature.tarekegn.assignment1;

interface InterfaceDemo {
	//static final String location = "out of town";
	void makeNoise();
	void eat();
	//void sleep();
	void roam();

}
abstract class Feline implements InterfaceDemo{
	public void roam() {
		System.out.println("I am Feline ");
	}
}
abstract class Canine implements InterfaceDemo {
	public void roam() {
		System.out.println("I am canine ");
	}
	
}
class Wolf extends Canine{
	public void makeNoise() {
		System.out.println("I make A noise... ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am eating... ");
	}
	public void roam() {
		System.out.println("I am roam... ");
	}
}
class TestInterfaceDemo{
	public static void main(String[] args) {
		 InterfaceDemo fe = new Wolf();
		 fe.roam();
		 fe.eat();
		 fe.makeNoise();
	}
	
}

