package com.wws.summary_util.Study.DesignPattern.CreateType.Singleton;

/**
 * @description: null
 * @create: Rock Wang  2024-08-10 17:42
 **/
public class DoubleCheckedLocking {
    private volatile static DoubleCheckedLocking uniqueInstance;

    private DoubleCheckedLocking() {
    }

    // advantage：Use a simple condition to determine whether an instance needs to be regenerated
    // 1. Determine whether the instance exists.
    // 2. Lock the method of creating an instance.
    public static DoubleCheckedLocking getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }

}
