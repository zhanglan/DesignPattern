package com.demo.factory;

/**
 * @author zhanglan
 * @date 2017/3/15 0015.
 */
public class OperationMult implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA*numberB;
    }
}
