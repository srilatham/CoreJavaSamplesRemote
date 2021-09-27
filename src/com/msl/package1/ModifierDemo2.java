package com.msl.package1;

public class ModifierDemo2 {

	int counter;
	
	public String display() {
		
		counter = 3;
		//System.out.println("In display method");
		
		return "Hello from display";
		
	}
	
	public int calculateSalary(int basicSal,int hra,String designation) {
		
		if(designation.equals("New")) {
			return 0;
		}else {
			return (basicSal*10)+ hra;
		}
		
	}
}
