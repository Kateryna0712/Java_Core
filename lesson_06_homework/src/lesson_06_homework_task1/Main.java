package lesson_06_homework_task1;

public class Main {
	public static void main(String[] args) {

		HourlyRateWorker worker1 = new HourlyRateWorker("jgguy", 172, 12);
		worker1.salary();
		FixedSalaryWorker worker2 = new FixedSalaryWorker("Sarah", 2500);
		worker2.salary();

	}

}
