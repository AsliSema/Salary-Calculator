
public class Employee {
	String name;
	double salary;
	int workHours; //per week
	int hireYear;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(){
		if(this.salary < 1000) {
			return 0;
		}else {
			return this.salary*0.03;
		}
	}
	
	public double bonus() {
		int optimumWorkHours = 40;
		if(this.workHours>40) {
			return (this.workHours - optimumWorkHours)*30;
		}else {
			return 0;
		}
	}
	
	public double raiseSalary() {
		int thisYear = 2021;
		int workingYear = thisYear -this.hireYear;
		double salaryIncrease = 0.0;
		if(workingYear < 10) {
			salaryIncrease = this.salary*0.05;
		}else if(workingYear>9 && workingYear<20) {
			salaryIncrease = this.salary*0.1;
		}else if(workingYear > 19){
			salaryIncrease = this.salary*0.15;
		}
		return salaryIncrease;
	}
	
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nSalary: " + this.salary + 
			   "\nWorking Hour: "+ this.workHours +
			   "\nHire Year: " + this.hireYear +
			   "\nTax: " + tax() +
			   "\nBonus: " + bonus() + 
			   "\nSalary Increase: " + raiseSalary() +
			   "\nSalary with Taxes and Bonuses: " + (this.salary + bonus() - tax()) +
			   "\nTotal Salary: " + (this.salary + raiseSalary());
	}
	
	
}
