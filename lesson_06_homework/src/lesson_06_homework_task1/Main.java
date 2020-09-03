package lesson_06_homework_task1;

public class Main {
	public static void main(String[] args) {

		HourlyRateWorker worker1 = new HourlyRateWorker("John", 168, 12);
		FixedSalaryWorker worker2 = new FixedSalaryWorker("Sarah", 2500);
		worker1.salary();
		worker2.salary();
	}

}
