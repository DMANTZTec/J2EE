package com.dmantz.methodinstances;

public class ManyMethods {

	private String gfName;

	public ManyMethods(String name) {
		gfName = name;
	}

	public void setName(String name) {

		gfName = name;
	}

	public String getName() {

		return gfName;
	}

	public void says() {

		System.out.printf("Ur first gf was %s", getName());
	}

}
