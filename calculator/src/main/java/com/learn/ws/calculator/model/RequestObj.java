package com.learn.ws.calculator.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestObj {

	private int o;
	private int a;
	private int b;

	public int getO() {
		return o;
	}
	public void setO(int o) {
		this.o = o;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}


	
}
