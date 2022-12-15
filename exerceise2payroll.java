package hw2;

import java.util.Scanner;


public class exerceise2payroll {
	public static void main(String[] args) {
		
		Scanner prl= new Scanner(System.in);
		int id = 0;//employee id
		String firstName = "";//first name of the employee
		String lastName = "";//last name of the employee
		int grossMonthlySalary = 0;//Gross Monthly Salary
		int age = 0; // age
		int totalPayroll = 0; // total payroll
		double avgSalary = 0; // average salary
		int highestSalary = 0; // highest salary
		int lowestSalary = 100000000; // lowest salary
		int count = 0; // count

			//reading data from keyboard


		while (id < 9999)	{
			
		System.out.print("ID: ");
		id = prl.nextInt();
		
		if (id == 9999) {
			break;
		}//end of if statement
		
		System.out.print("First Name: ");
		firstName = prl.next();


		System.out.print("Last Name: ");
		lastName = prl.next();
		
		System.out.println("Full Name: " + firstName + " " + lastName);
		
		System.out.print("Gross Monthly Salary: ");
		grossMonthlySalary = prl.nextInt();

		if (grossMonthlySalary<999) {
			System.out.println("Taxes: " + (grossMonthlySalary*0));
			System.out.println("Net Salary: " + (grossMonthlySalary - (grossMonthlySalary*0)) );
		}//end of if condition		
		
		if (grossMonthlySalary>=1000 && grossMonthlySalary<=2999) {
			System.out.println("Taxes: " + (grossMonthlySalary*0.1));
			System.out.println("Net Salary: " + (grossMonthlySalary - (grossMonthlySalary*0.1)) );
		}//end of if condition
		
		if (grossMonthlySalary>=3000 && grossMonthlySalary<=9999) {
			System.out.println("Taxes: " + (grossMonthlySalary*0.2));
			System.out.println("Net Salary: " + (grossMonthlySalary - (grossMonthlySalary*0.2)) );
		}//end of if condition
		
		if (grossMonthlySalary>=10000) {
			System.out.println("Taxes: " + (grossMonthlySalary*0.3));
			System.out.println("Net Salary: " + (grossMonthlySalary - (grossMonthlySalary*0.3)) );
		}//end of if condition
		
    	System.out.println("----------------------------");
    	

		

		totalPayroll = totalPayroll + grossMonthlySalary ;

		
		count = count + 1;
		avgSalary = totalPayroll / count;

		
		
		if (grossMonthlySalary>=highestSalary) {
			highestSalary=grossMonthlySalary;
		}
		
		if (grossMonthlySalary<=lowestSalary) {
			lowestSalary = grossMonthlySalary;
		}
		

		

		}//end of while loop

    	System.out.println("----------------------------");
		System.out.println("Total Payroll:" +totalPayroll);
		System.out.println("Avg Salary:" + avgSalary);
		System.out.println("Highest Salary: " + highestSalary);
		System.out.println("Lowest Salary: " + lowestSalary);
		
	}//end of main method

}//end of class
