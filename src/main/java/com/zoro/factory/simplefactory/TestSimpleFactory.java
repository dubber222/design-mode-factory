package com.zoro.factory.simplefactory;

import com.zoro.factory.DesignModeBook;
import com.zoro.factory.simplefactory.BookStore;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        //new BookStore().getBookByName("com.zoro.factory.DesignModeBook").purchase();
        new BookStore().getBookByClass(DesignModeBook.class).purchase();
    }
}
