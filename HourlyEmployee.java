
public class HourlyEmployee extends Employee {
	double wage;
	double hours;
	
	HourlyEmployee(String name, double wage, double hours) {
		this.name = name;
		this.wage = wage;
		this.hours = hours;
	}
	public double calculatePay() {
		return wage*hours*52;
	}
}
