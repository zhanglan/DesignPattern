package com.demo.strategy;

public class Client {
	
	public static void main(String[] args){
		StrategyInterface strategy = new StrategyFly();
		Context ctx = new Context(strategy);
		ctx.travelStrategy();
	}

}
