package com.generics;

import java.util.ArrayList;
import java.util.List;

class StudentData {
	public <E> void printListData(List<E> list) {
		for(E element: list) {
			System.out.println(element);
		}
	}
	
	public <E> void printArrayData(E[] arrayData) {
		for(E element: arrayData) {
			System.out.println(element);
		}
	}
}
public class Student {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		StudentData studentData = new StudentData();
		studentData.printListData(list);
	}

}
