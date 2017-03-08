package com.inheritance;

public class Manager extends Employee {
	
	private double bonus;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		// TODO Auto-generated constructor stub
		
		bonus = 0;
	}
	
	public double getSalary(){
		/*
		 *  //超类 和子类中都有getSalary() 使用基础工资时候就需要使用超类中的getSalary() 使用super访问
		 */
		double baseSalary = super.getSalary(); 
		return baseSalary += bonus;
	}
	public void setBonus(double b){
		bonus = b;
	}
	
	
}
