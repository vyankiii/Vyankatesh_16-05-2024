package com.javaTypesOfClasses;

//Normal/Concrete/General class
public class NormalGeneralConcrete {

	// fields
	int age = 26;
	static int id = 100;

	// constructors
	public NormalGeneralConcrete() {
		age = 20;
	}

	// blocks
	static {
		System.out.println(id);
	}

	// methods
	public void findAge() {// non static method
		System.out.println(age);
	}

	public static void findId() {// static method
		System.out.println(id);
	}

	// inner classes
	public static void main(String[] args) {
		//Objects
		NormalGeneralConcrete obj = new NormalGeneralConcrete();
		obj.findAge();
		findId();
		
		
	}

}
