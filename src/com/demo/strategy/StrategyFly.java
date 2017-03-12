package com.demo.strategy;
/**
 * 飞机出行策略
 * @author zhanglan
 *
 */
public class StrategyFly implements StrategyInterface {

	public void travel() {
		System.out.println("坐飞机出行");
	}

}
