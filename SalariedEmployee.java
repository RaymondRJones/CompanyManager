
public class SalariedEmployee extends Employee {
	double salary;
	
	
	SalariedEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getname(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double calculatePay() 
	{
		return salary;
	}
}
