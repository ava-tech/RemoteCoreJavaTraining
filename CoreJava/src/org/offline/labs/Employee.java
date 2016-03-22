package org.offline.labs;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
    private String fname;
    private String lname;

    public Employee(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + "]";
	}

	public static void main(String[] args){
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Mohammad","Alam"));
		emp.add(new Employee("John","Smith"));
		
		for(Object o: emp){
			System.out.println(o.toString());
		}
		System.out.println(emp.get(0).fname);
		System.out.println(emp.get(0).lname);
		System.out.println(emp.get(1).fname);
		System.out.println(emp.get(1).lname);
	}

}



