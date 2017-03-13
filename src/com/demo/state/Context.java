package com.demo.state;

/**
 * 状态模式环境类
 * @author zhanglan
 *
 */
public class Context {
    private static Context ctx;
    private LiftState state;

    private Context(LiftState state){
        this.state = state;
    }

    public static Context getInstance(){
        if(ctx==null){
            ctx = new Context(new OpenState());
        }
        return ctx;
    }

    public void setState(LiftState state){
        this.state = state;
    }
    public void open(){
        state.open();
    }

    public void close(){
        state.close();
    }

    public void run(){
        state.run();
    }

    public void stop(){
        state.stop();
    }
}
