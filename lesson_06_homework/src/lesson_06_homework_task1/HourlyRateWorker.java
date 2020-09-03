package lesson_06_homework_task1;

public class HourlyRateWorker extends Worker implements Salary {
	private int summaryMonthworkedHours;
	private double hourRate;

	public HourlyRateWorker(String name, int summaryMonthworkedHours, double hourRate) {
		super(name);
		this.summaryMonthworkedHours = summaryMonthworkedHours;
		this.hourRate = hourRate;
	}

	@Override
	public void salary() {
		double salary = this.summaryMonthworkedHours * this.hourRate;
		System.out.println(" Salary " + super.getName() + " is " + salary + " dollars");

	}

}
