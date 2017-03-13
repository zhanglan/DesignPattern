package com.demo.state;

/**
 * 状态模式具体状态类（电梯运行状态）
 * @author zhanglan
 * @date 2017/3/13.
 */
public class RunState implements LiftState {
    @Override
    public void open() {
        System.out.println("电梯运行，不能开门");
    }

    @Override
    public void close() {
        System.out.println("电梯运行，门已关闭");
    }

    @Override
    public void run() {
        System.out.println("电梯正处于运行状态");
    }

    @Override
    public void stop() {
        System.out.println("停止电梯");
        Context.getInstance().setState(new StopState());
    }
}
