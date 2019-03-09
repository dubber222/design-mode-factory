package com.zoro.factory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class LiteratureBook implements Ibook{
    @Override
    public void purchase() {
        System.out.println("预购买《文学》书籍");
    }
}
