package com.zoro.factory.factorymethod;

import com.zoro.factory.DesignModeBook;
import com.zoro.factory.simplefactory.BookStore;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        new DesignModeBookStore().pick().purchase();
    }
}
