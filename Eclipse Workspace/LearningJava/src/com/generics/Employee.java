package com.generics;
/*
 * T - Type
 * E - Element
 * K - Key
 * N - Number
 * V - Value
 */
class EmployeeData<T1, T2> {
	private T1 empID;
	private T2 empName;
	
	public EmployeeData(T1 empID, T2 empName) {
		this.empID = empID;
		this.empName = empName;
	}

	public T1 getEmpID() {
		return empID;
	}

	public T2 getEmpName() {
		return empName;
	}

	@Override
	public String toString() {
		return "EmployeeData [empID=" + empID + ", empName=" + empName + "]";
	}
	
	
}

public class Employee {

	public static void main(String[] args) {
		EmployeeData<String, Integer> data = new EmployeeData<String, Integer>("Raza", 1);
		System.out.print(data.getEmpID());
	}

}