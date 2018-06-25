package com.sravan.oops;

public class ExampleException {
	public static void main(String[] args) {

		System.out.println("statement1");
		System.out.println("statement2");
		System.out.println("statement3");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException r) {
			r.printStackTrace();
			System.out.println("jhgj");
			System.out.println(r.getMessage());
		}
		System.out.println("statement4");
		String name = "arun";
		try {
			System.out.println(name.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			// TODO: handle exception
			System.out.println("sravan");
		}
		System.out.println("statement5");
		int a[]= {1,2,3,7};
		int index=a[3];
		try {
		System.out.println(a[index]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Sumanth");
		}
		System.out.println("statement6");
		
		System.out.println("statement7");

	}

}
