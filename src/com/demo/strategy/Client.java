package com.demo.strategy;

public class Client {
	
	public static void main(String[] args){
		Context ctx = new Context("walk");
		ctx.travelStrategy();
	}

}
