package com.zoro.factory.abstractfactory;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class DesignModeStore implements IBookStore{

    @Override
    public IPaperBook purchasePaper() {
        return new PaperDesignModeBook();
    }

    @Override
    public IEBook purchaseE() {
        return new EDesignModeBook();
    }
}
