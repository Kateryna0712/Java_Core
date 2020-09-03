package com.lgs.lab.interface2;

public class MyCalculator implements com.lgs.lab.interface1.Numerable {
	int a;
	int b;

	MyCalculator() {

	}

	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int plus() {

		return this.a + this.b;
	}

	@Override
	public int minus() {

		return this.a - this.b;
	}

	@Override
	public int multiplay() {

		return this.a * this.b;
	}

	@Override
	public int devide() {

		return this.a / this.b;
	}

	static void ViewResult(int result) {
		System.out.println("Result" + result );
	}

}
