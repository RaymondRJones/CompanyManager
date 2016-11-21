
public class Executive extends Employee {
	double salary;
	double stock;
	double bonus;
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	Executive(String name, double salary, double stock, double bonus) {
		this.name = name;
		this.salary = salary;
		this.stock = stock;
		this.bonus = bonus;
	}
	public double calculatePay(){
		return salary + stock + bonus;
	}
	public String toString()
	{
		return "Name: " + name +
				"\nSalary: " + salary +
				"\nPay: " + calculatePay();
	}
	
	
}
