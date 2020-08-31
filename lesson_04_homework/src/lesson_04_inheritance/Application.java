package lesson_04_inheritance;

public class Application {
	public static void main(String[] args) {

		Robot robot = new Robot();
		CoffeeRobot coffeeRobot = new CoffeeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker();

		robot.work();
		coffeeRobot.work();
		robotDancer.work();
		robotCoocker.work();

		System.out.println();

		Robot[] robotArray = new Robot[4];
		robotArray[0] = robot;
		robotArray[1] = coffeeRobot;
		robotArray[2] = robotDancer;
		robotArray[3] = robotCoocker;

		for (int i = 0; i < robotArray.length; i++) {
			robotArray[i].work();
		}
	}
}