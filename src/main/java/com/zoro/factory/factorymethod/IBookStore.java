package com.zoro.factory.factorymethod;

import com.zoro.factory.Ibook;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 * 工厂方法模式
 */
public interface IBookStore {
    Ibook pick();
}
