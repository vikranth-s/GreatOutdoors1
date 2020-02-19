package com.capgemini.greatoutdoors.exceptions;

public class RetailerException extends Exception {

	String log;

	public RetailerException(String log) {
		super();
		this.log = log;
	}
	public void showLog()
	{
		System.out.println(log);
	}
}
