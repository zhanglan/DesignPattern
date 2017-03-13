package com.demo.state;

/**
 * @author zhanglan
 * @date 2017/3/13.
 */
public class Client {

    public static void main(String[] args){
        Context.getInstance().open();
        Context.getInstance().close();
        Context.getInstance().run();
        Context.getInstance().stop();
    }

}
