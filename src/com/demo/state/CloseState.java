package com.demo.state;

/**
 * 状态模式具体状态类（电梯关闭状态）
 * @author zhanglan
 * @date 2017/3/13.
 */
public class CloseState implements LiftState {
    @Override
    public void open() {
        System.out.println("打开电梯门");
        Context.getInstance().setState(new OpenState());
    }

    @Override
    public void close() {
        System.out.println("已处于电梯关闭状态");
    }

    @Override
    public void run() {
        System.out.println("启动电梯");
        Context.getInstance().setState(new RunState());
    }

    @Override
    public void stop() {
        System.out.println("关闭状态，已停止");
    }
}
