package com.javaTypesOfClasses;

//@FunctionalInterfaceDemo
public interface FunctionalInterfaceDemo {
	// No non-static and static fields
//	int id = 10;

	// public static final fields
	public static final int ORGANIZATION_CODE = 8907;
	public static final String ORGANIZATION_NAME = "IBM";

	// methods*

	default void get() {

	}

	default void show() {

	}

	// abstract method ==>only one method
	public void getInfo1();// Abstract methods do not specify a body

	// public void getInfo2();//Abstract methods do not specify a body

	public static void getData() {
		System.out.println(ORGANIZATION_NAME);
		System.out.println(ORGANIZATION_CODE);
	}

	// inner classes

	// No Objects Creation

}
