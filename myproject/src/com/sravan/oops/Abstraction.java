package com.sravan.oops;

public abstract class Abstraction {
	abstract void m1();
	
	public void display() {
		System.out.println("iam normal ");
	}
	class Child extends Abstraction {

		@Override
		void m1() {
			// TODO Auto-generated method stub
			System.out.println("sravan");
		}
		
	}
	
}
