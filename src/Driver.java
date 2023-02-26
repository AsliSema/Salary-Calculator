import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Salary: ");
		double salary = scanner.nextDouble();
		System.out.print("Enter working hours per week: ");
		int workingHours = scanner.nextInt();
		System.out.print("Enter the year you started working: ");
		int hireYear = scanner.nextInt();
		Employee employee1 = new Employee(name, salary, workingHours, hireYear);
		
		System.out.println(employee1.toString());
	}
}
