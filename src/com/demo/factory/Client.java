package com.demo.factory;

/**
 * @author zhanglan
 * @date 2017/3/15 0015.
 */
public class Client {
    public static void main(String[] args){
        Operation operation = OperationFactory.getInstance().getOperation("/");
        double result = operation.getResult(1,3);
        System.out.println("result-->"+result);
    }
}
