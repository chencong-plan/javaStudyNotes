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
		 *  //���� �������ж���getSalary() ʹ�û�������ʱ�����Ҫʹ�ó����е�getSalary() ʹ��super����
		 */
		double baseSalary = super.getSalary(); 
		return baseSalary += bonus;
	}
	public void setBonus(double b){
		bonus = b;
	}
	
	
}
