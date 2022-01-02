package com.generics;

class  Data {
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	
}


class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
//		Data data = new Data("Some String");
//		String variable = (String) data.getObj();
//		
//		System
		GenericClass<String> genericData = new GenericClass<String>("Some Data");
		GenericClass<Integer> genericNumber = new GenericClass<Integer>(1);
		String data = genericData.getData();
		System.out.print(genericData.getData());
	}

}