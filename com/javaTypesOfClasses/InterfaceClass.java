package com.javaTypesOfClasses;

public interface InterfaceClass {

	// No non-static and static fields
	/**
	 * Illegal modifier for the interface field Organization.organizationCode; only
	 * public, static & final are permitted
	 */

	// public static final fields
	public static final int CODE = 127;
	public static final String NAME = "TCS";

	// constructors
	/*
	 * public Organization()//Interfaces cannot have constructors {
	 * 
	 * }
	 */

	// blocks

	/*
	 * static{ //The interface Organization cannot define an initializer
	 * 
	 * }
	 */

	// methods*

	// abstract method // by default method is abstract
	public void getInfo();// Abstract methods do not specify a body

	public abstract void getShow();// Abstract methods do not specify a body

	public static void getData() {
		System.out.println(CODE);
		System.out.println(NAME);

	}

	// inner classes

	// No Objects Creation

}
