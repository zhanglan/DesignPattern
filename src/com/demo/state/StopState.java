package com.demo.state;

/**
 * 状态模式具体状态类（电梯停止状态）
 * @author zhanglan
 * @date 2017/3/13.
 */
public class StopState implements LiftState {
    @Override
    public void open() {
        System.out.println("打开电梯门");
        Context.getInstance().setState(new OpenState());
    }

    @Override
    public void close() {
        System.out.println("关闭电梯门");
        Context.getInstance().setState(new CloseState());
    }

    @Override
    public void run() {
        System.out.println("运行电梯");
        Context.getInstance().setState(new RunState());
    }

    @Override
    public void stop() {
        System.out.println("已处于停止状态");
    }
}
