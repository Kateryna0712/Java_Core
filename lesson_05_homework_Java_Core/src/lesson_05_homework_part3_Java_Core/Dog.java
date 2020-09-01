package lesson_05_homework_part3_Java_Core;

public class Dog {
	private String name;
	private int age;
	private String color;
	

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog(String name, int age, String color) {
		this(name, age);
		this.color = color;

	
}
}
