package com.study.log4j.rmi;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

/**
 * @author sander-xu@zamplus.com
 * @date 2022/5/30 3:18 下午
 */
public class RmiObj implements ObjectFactory {

    static {
        System.out.println("RmiObj code");
        // 这里可以写任意代码,比如木马程序,病毒程序,死循环,后门程序等等.
    }
    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        return null;
    }
}
