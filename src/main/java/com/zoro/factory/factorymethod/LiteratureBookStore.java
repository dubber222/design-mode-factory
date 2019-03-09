package com.zoro.factory.factorymethod;

import com.zoro.factory.Ibook;
import com.zoro.factory.LiteratureBook;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class LiteratureBookStore implements IBookStore {

    @Override
    public Ibook pick() {
        return new LiteratureBook();
    }
}
