package com.zoro.factory.factorymethod;

import com.zoro.factory.DesignModeBook;
import com.zoro.factory.Ibook;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class DesignModeBookStore implements IBookStore {
    @Override
    public Ibook pick() {
        return new DesignModeBook();
    }
}
