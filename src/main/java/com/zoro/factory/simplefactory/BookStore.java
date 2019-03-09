package com.zoro.factory.simplefactory;

import com.zoro.factory.Ibook;
import org.apache.commons.lang3.StringUtils;

/**
 * Demo class
 *
 * @author dubber
 * @date 2019/3/9
 */
public class BookStore {
    public Ibook getBookByName(String bookName) {
        if (StringUtils.isNotBlank(bookName)) {
            try {
                return (Ibook) Class.forName(bookName).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Ibook getBookByClass(Class clazz){
        if (null!=clazz) {
            try {
                return (Ibook) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
