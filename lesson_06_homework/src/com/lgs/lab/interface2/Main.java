package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class Main {
public static void main(String[] args) {
	MyCalculator calculator = new MyCalculator(67, 23);
	calculator.ViewResult(calculator.plus());
	calculator.ViewResult(calculator.minus());
	calculator.ViewResult(calculator.multiplay());
	calculator.ViewResult(calculator.devide());
}
}
