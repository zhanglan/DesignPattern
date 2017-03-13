package com.demo.state;

/**
 * 状态模式具体状态类（电梯开门状态）
 * @author zhanglan
 * @date 2017/3/13.
 */
public class OpenState implements LiftState {
    @Override
    public void open() {
        System.out.println("电梯已处于开门状态");
    }

    @Override
    public void close() {
        System.out.println("关闭电梯");
        Context.getInstance().setState(new CloseState());
    }

    @Override
    public void run() {
        System.out.println("开门状态不能运行");
    }

    @Override
    public void stop() {
        System.out.println("开门状态，已停止");
    }
}
