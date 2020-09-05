package com.lgs.lab.interface2;

public class MyCalculator implements com.lgs.lab.interface1.Numerable {

	@Override
	public int plus(int a, int b) {
		int result = a + b;
		return result;

	}

	@Override
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	@Override
	public int multiplay(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	public int devide(int a, int b) {
		int result = a / b;
		return result;
	}
}
