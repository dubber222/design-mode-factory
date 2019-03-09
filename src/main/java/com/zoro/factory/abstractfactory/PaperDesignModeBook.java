package com.zoro.factory.abstractfactory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class PaperDesignModeBook implements IPaperBook{
    @Override
    public void purchase() {
        System.out.println("预购买纸质《设计模式》书籍");
    }
}
