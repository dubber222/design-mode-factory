package com.zoro.factory.abstractfactory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class EDesignModeBook implements IEBook{
    @Override
    public void purchase() {
        System.out.println("预购买电纸《设计模式》书籍");
    }
}
