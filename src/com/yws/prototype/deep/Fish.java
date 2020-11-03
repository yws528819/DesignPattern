package com.yws.prototype.deep;

import java.io.Serializable;

public class Fish implements Cloneable, Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fish(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
