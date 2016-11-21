
public abstract class Employee {
	double salary;
	String name;
	
	abstract public  double calculatePay();
	public void setSalary(double salary) {
	this.salary = salary;
	}
	public String getName() {
		return name;
	};
}
