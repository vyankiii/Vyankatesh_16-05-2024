package com.javaTypesOfClasses;

// 2] Abstract classs
public abstract class Abstract {

	// fields
	private int departementId;
	private String AbstractName;

	public static String countryName;

	// constructors (Default constructor)
	public Abstract() {

	}

//(Parameterized Construnctor)
	public Abstract(int departementId, String AbstractName) {
		this.departementId = departementId;
		this.AbstractName = AbstractName;
	}

	// blocks
	static {
		countryName = "UK";
	}

	// methods
	public void getAbstractDetails() {

	}

	// Abstract methods
	public abstract void getDetails();// Abstract methods do not specify a body

	// inner classes

	// No Objects Creation 

}
