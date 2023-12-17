package com.inter;

@FunctionalInterface
interface defaultmethod{
	public void name();
	default String details() {
		System.out.println("Hello this is default method");
		return "Hello this is default method";
	}
}
public class DefaultMethods implements defaultmethod {

	@Override
	public void name() {
		System.out.println("This is an abstract method..");
		
	}
	public static void main(String[] args) {
		DefaultMethods dm= new DefaultMethods();
		dm.name();
		dm.details();

	}

}
