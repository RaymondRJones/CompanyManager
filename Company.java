import java.util.Scanner;
import java.awt.List;
import java.util.ArrayList;
public class Company {
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
    	System.out.println("Welcome to the company manager");
    while(true) {
    	System.out.println("What would you like to do?"
    			+ " \n1.)Hire Employees"
    			+ " \n2.)Fire Employees"
    			+ " \n3.)Raise Employees"
    			+ "	\n4.)List Employees"
    			+ "	\n5.)Exit");
    	int userInput = input.nextInt();
    	switch(userInput)
    	{
    	case 1: 
    		System.out.print("How many are you hiring?");
    		int amount = input.nextInt();
    		for(int i = 0; i < amount; i++){
    			addEmployee(input, employeeList);
    		}
    		break;
    		
    	case 2:
    		System.out.print("How many are you firing?");
    		int fireNum = input.nextInt();
    		for(int i = 0; i < fireNum; i++){
    			fireEmployee(input, employeeList);
    		}
    		break;
    	case 3:
    		System.out.print("How many will get raises?");
    		int raiseNum = input.nextInt();
    		for(int i = 0; i < raiseNum; i++){
    			raiseEmployee(input, employeeList);
    		}
    		break;
    	case 4:
    		for(int i = 0; i < employeeList.size(); i++) {
    			System.out.println(employeeList.get(i).getName());
    		}
    		break;
    	case 5:
    		System.out.println("Thank you, shutting down...");
    		System.exit(0);
    		break;
    	}
    }
    	
		
    }
    
    public static void addEmployee(Scanner input, ArrayList<Employee> employeeList) 
    {
		System.out.println("What Employee would you like to add?(1=unsalary, 2= salary 3= manager"
				+ " 4= Executive");
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println("Please enter the name, wage, and hours of the employee");
			String name = input.next();
			double wage = input.nextDouble();
			double hours = input.nextDouble();
			employeeList.add(new HourlyEmployee(name, wage, hours));
		}
		else if(choice == 2) {
			System.out.println("Please enter the name and salary of the employee");
			String name = input.next();
			double salary = input.nextDouble();
			employeeList.add(new SalariedEmployee(name, salary));
		}
		else if(choice == 3){
			System.out.println("Please enter the name, salary, and bonus of the manager");
			String name = input.next();
			double salary = input.nextDouble();
			double bonus = input.nextDouble();
			employeeList.add(new Manager(name, salary, bonus));
			
		}
		else if(choice == 4){
			System.out.println("Please enter the name, salary, bonus, and stock value of the executive");
			String name = input.next();
			double salary = input.nextDouble();
			double bonus = input.nextDouble();
			double stock = input.nextDouble();
			employeeList.add(new Executive(name, salary, bonus, stock));
		}
		else if(choice == 5) {
			System.exit(0);
		}
		else{
			System.out.println("Invalid input");
		}
	}
    public static void fireEmployee(Scanner input, ArrayList<Employee> employeeList) {
    	System.out.println("Enter the name of the employee you would like to fire");
    	String tempName = input.next();
    	for(int i =0; i < employeeList.size(); i++) {
    		//Gets name from list and checks if matachs selected employee
    		if(employeeList.get(i).getName().equals(tempName)) {
    			employeeList.remove(i);
    		}
    	}
    }
    public static void raiseEmployee(Scanner input, ArrayList<Employee> employeeList) {
    	System.out.println("Enter the name of the employee who is receiving the raise");
    	String tempName = input.next();
    	System.out.println("What is their new salary?");
    	double amount = input.nextDouble();
    	//Use setter to set new pay for employees in the ArrayList
    	for(int i =0; i < employeeList.size(); i++) {
    		if(employeeList.get(i).getName().equals(tempName)){
    			employeeList.get(i).setSalary(amount);    			
    		}
    	}
    }
}
