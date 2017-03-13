package com.demo.state;

/**
 *状态模式抽象状态类（电梯状态）
 * @author zhanglan
 * @date 2017/3/13.
 */
public interface LiftState {
    public void open();
    public void close();
    public void run();
    public void stop();
}
