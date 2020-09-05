package lesson_06_homework_task1;

public abstract class Worker implements Salary{
	String name;

	public Worker(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
