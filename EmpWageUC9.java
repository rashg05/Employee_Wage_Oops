package com.bridgelab.oopsconcept;

public class EmpWageUC9 {
	public static final int isPartTime  = 1;
	public static final int isFullTime  = 2;

	private final String company;
	private final int empRatePerHrs;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;

	public EmpWageUC9(String company, int empRatePerHrs, int numOfWorkingDays, int maxHrsPerMonth){

		this.company = company;
		this.empRatePerHrs = numOfWorkingDays;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

	public void computeEmpWage(){

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		//computation
		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays){

			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;

			switch (empCheck){

			case isPartTime :
				empHrs = 4;
				break;
			case isFullTime :
				empHrs = 8;
				break;
			default :
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day : "+totalWorkingDays + "Emp Hr : " + empHrs);
		}

		totalEmpWage =  totalEmpHrs + empRatePerHrs;
	}

	//@override
	public String toString(){

		return "Total Emp Wage For Company : "+company + " is : "+totalEmpWage;
	}

	public static void main(String [] args){

		EmpWageUC9 apple = new EmpWageUC9("Apple", 20, 2, 10);
		EmpWageUC9 microsoft = new EmpWageUC9("Microsoft", 20, 4, 10);
		apple.computeEmpWage();
		System.out.println(apple);

		microsoft.computeEmpWage();
		System.out.println(microsoft);
	}
}
