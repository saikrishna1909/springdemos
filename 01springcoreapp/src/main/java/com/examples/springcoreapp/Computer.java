package com.examples.springcoreapp;

public class Computer {
	public String cpu;
	public String memory;
	public String storage;
	
	public Computer(String cpu, String memory, String storage) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", memory=" + memory + ", storage=" + storage + "]";
	}
	
}
