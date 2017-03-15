package com.demo.factory;

/**
 * @author zhanglan
 * @date 2017/3/15 0015.
 */
public class OperationFactory {
    private Operation operation = null;
    private static OperationFactory instance = null;
    private OperationFactory(){

    }
    public static OperationFactory getInstance(){
        if(instance==null){
            instance = new OperationFactory();
        }
        return instance;
    }

    public Operation getOperation(String type){
        switch (type){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMult();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
