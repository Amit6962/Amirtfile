package com.vir.model;

public class Student {
	
	private int roll;
	private String name;
	private String branch;
	private int noBooksIssued;
	
	public Student(int roll, String name, String branch) {
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
		noBooksIssued=0;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getNoBooksIssued() {
		return noBooksIssued;
	}
	public void setNoBooksIssued(int noBooksIssued) {
		this.noBooksIssued = noBooksIssued;
	}
	public void incrementNoOfBooks()
	{
		noBooksIssued++;
	}
	public void decrementNoOfBooks()
	{
		noBooksIssued--;
	}
	
	

}
