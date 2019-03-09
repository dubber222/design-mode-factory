package com.zoro.factory.abstractfactory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class PaperLiteratureBook implements IPaperBook{
    @Override
    public void purchase() {
        System.out.println("预购买纸质《w文学》书籍");
    }
}
