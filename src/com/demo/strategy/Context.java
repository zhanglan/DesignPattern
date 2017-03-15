package com.demo.strategy;

/**
 * 策略模式+简单工厂模式
 */
public class Context {
	private StrategyInterface strategy;
	public Context(String type) {
		switch (type){
			case "drive":
				strategy = new StrategyDrive();
				break;
			case "fly":
				strategy = new StrategyFly();
				break;
			case "walk":
				strategy = new StrategyWalk();
				break;
			default:
					break;
		}
	}
	
	public void travelStrategy(){
		strategy.travel();
	}

}
