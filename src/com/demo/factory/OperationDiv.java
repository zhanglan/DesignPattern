package com.demo.factory;

/**
 * @author zhanglan
 * @date 2017/3/15 0015.
 */
public class OperationDiv implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        if(numberB==0){
            System.out.println("被除数不能为0");
            return 0;
        }
        return numberA/numberB;
    }
}
