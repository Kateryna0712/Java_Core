package lesson_06_homework_task1;

public class FixedSalaryWorker extends Worker {

	private double monthRate;

	public FixedSalaryWorker(String name, double monthRate) {
		super(name);
		this.monthRate = monthRate;
	}

	@Override
	public void salary() {
		double salary = this.monthRate;
		System.out.println(" Salary " + super.getName() + " is " + salary + " dollars");

	}

}
