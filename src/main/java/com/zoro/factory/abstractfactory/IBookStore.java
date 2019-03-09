package com.zoro.factory.abstractfactory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public interface IBookStore {
    IPaperBook purchasePaper();
    IEBook purchaseE();
}
