package com.zoro.factory.abstractfactory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class TestAbstractFactory {
    public static void main(String[] args){

        new DesignModeStore().purchaseE().purchase();
        new DesignModeStore().purchasePaper().purchase();
    }
}
