
public class Manager extends Employee {
	double salary;
	double bonus;
	
	public String getName() {
		return name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	Manager(String name, double salary, double bonus) 
	{
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double calculatePay() 
	{
		return salary+bonus;
	}
}
