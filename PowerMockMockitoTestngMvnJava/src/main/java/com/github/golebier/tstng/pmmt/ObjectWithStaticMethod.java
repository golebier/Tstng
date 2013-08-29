package com.github.golebier.tstng.pmmt;

/**
 * @author Gra <Gołębiewski Radosław A.> https://github.com/golebier
 *         plus.google.com/u/0/103563456777990778742/about
 *         http://www.linkedin.com
 *         /pub/rados%C5%82aw-go%C5%82%C4%99biewski/70/832/35
 */
public class ObjectWithStaticMethod {
    public static final String PREFIX_STRING = "Greetings ";

    public static String prepareStaticMethodOperations(String param) {
        return PREFIX_STRING + param;
    }
}
