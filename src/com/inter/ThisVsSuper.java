package com.inter;


class Animal{
	public void eat() {
		System.out.println("Animal class....");
	}
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog class....");
	}
	void anothereat() {
		this.eat();
	}
	
}
public class ThisVsSuper {

	public static void main(String[] args) {
		//Animal a= new Animal();
		Dog d= new Dog();
	   // d.eat();
	    d.anothereat();
		

	}

}
