package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class Main {
public static void main(String[] args) {
	 MyCalculator calculator=new MyCalculator();
     System.out.println(calculator.plus(23,67));
     System.out.println(calculator.minus(127,5));
     System.out.println(calculator.devide(600,3));
     System.out.println(calculator.multiplay(45,89));
 }
}
