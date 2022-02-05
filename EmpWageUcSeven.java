package com.bridgelab.oopsconcept;

public class EmpWageUcSeven {


	double IS_PRESENT = Math.floor(Math.random() * 10) % 2;

	public static void main(String[] args) {
		EmpWageUcSeven obj = new EmpWageUcSeven();
		EmpWageUcSeven(obj.IS_PRESENT);

	}

	private static void EmpWageUcSeven(double IS_PRESENT2) {
		double PRESENT =IS_PRESENT2 ;
		if(PRESENT == 1) {
			System.out.println("employee is present");
			full_time();
		}
		else {
			System.out.println("employee is absent");
			wageDaily(0,0);
		}	

	}
	
	public static void full_time() {
		double IS_FULL_TIME = Math.floor(Math.random() * 10) % 2;
		if(IS_FULL_TIME == 1) {
			System.out.println("employee is Full Time");
			wageDaily(8,20);
			wageMonthly(8,20,20);
		}
		else {
			System.out.println("employee is Part Time");
			wageDaily(4,20);
			wageMonthly(4,20,20);

		}
	}

	public static void wageDaily(int hrs,int rate) {
		double empwage=rate*hrs;
		System.out.println("employee daily wage= "+ empwage);
	}

	public static void wageMonthly(int hrs,int rate,int days) {
		double empwage=rate*(hrs*days);
		System.out.println("employee monthly wage= "+ empwage);
	}

	public static void conditionCheck() {
		int hrs=8;
		int rate=20;
		int days=1;
		while( days <= 20 && hrs <= 100) {
			double empwage=rate*(hrs*days);
			System.out.println("employee monthly wage= "+ empwage);
			days+=1;
			hrs+=8;
		}
	}
}
