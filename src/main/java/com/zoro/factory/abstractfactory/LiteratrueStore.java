package com.zoro.factory.abstractfactory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class LiteratrueStore implements IBookStore{

    @Override
    public IPaperBook purchasePaper() {
        return new PaperLiteratureBook();
    }

    @Override
    public IEBook purchaseE() {
        return new ELiteratureBook();
    }
}
