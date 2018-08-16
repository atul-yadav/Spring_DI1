package com.jda.beans;

public class Myfirst {
	private String data;
	private int count;
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Myfirst(String data, int count){
		this.data = data;
		this.count = count;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void thisMethod(){
		System.out.println("Inside Method");
	}

}
