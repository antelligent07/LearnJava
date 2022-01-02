package com.collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {

	static ArrayList<String> listNames = new ArrayList<>();
	public static void main(String[] args) {
		App app = new App();
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(0, 7);
		System.out.print(list.contains(2));
		System.out.print(list.indexOf(7));
		listNames.add("Raza");
		listNames.add("Shahid");
		listNames.add("Warner");
		listNames.add("Marcus");
		listNames.add("Labuschagne");
		listNames.add("Smith");
		listNames.add("Wade");
		listNames.add("Starc");
		listNames.add("Cummins");
//		System.out.println(listNames.get(0));
//		System.out.println(listNames);
		
		
		app.displayList(listNames);
		System.out.println("_____________________________");
		app.removeByPosition(6);
		app.displayList(listNames);
		System.out.println("_____________________________");
		app.removeByString("Cummins");
		app.displayList(listNames);
		System.out.println("_____________________________");
		app.modifyNameByPosition(0, "Head");
		app.displayList(listNames);
		System.out.println("_____________________________");
		app.modifyName("Marcus","Raza");
		app.displayList(listNames);
	}
	void removeByPosition(int position){
		listNames.remove(position);
	}
	void removeByString(String name){
		listNames.remove(name);
	}
	void modifyNameByPosition(int position, String newName) {
		listNames.set(position, newName);
	}
	void modifyName(String oldName, String newName) {
		listNames.set(listNames.indexOf(oldName), newName);
	}
	boolean searchName(String name) {
		return(listNames.contains(name));
	}
	int getIndexOfName(String name) {
		return(listNames.indexOf(name));
	}
	void displayList(ArrayList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}
	}
}
