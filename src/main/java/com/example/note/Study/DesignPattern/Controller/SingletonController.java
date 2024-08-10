package com.wws.summary_util.Study.DesignPattern.Controller;

import com.wws.summary_util.Study.DesignPattern.CreateType.Singleton.Singleton;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: null
 * @create: Rock Wang  2024-08-10 16:25
 **/
public class SingletonController {

    private static final Logger log = LoggerFactory.getLogger(SingletonController.class);

    @Test
    public  void Test1(){
        System.out.println("1231");
    }

    @Test
    public  void Test2(){
        Singleton singleton = Singleton.getUniqueInstance();
        // com.wws.summary_util.Study.DesignPattern.CreateType.Singleton.Singleton@1563da5
        System.out.println(singleton);

    }
}
