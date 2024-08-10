package com.example.note.Study.DesignPattern.CreateType.Singleton;

import java.io.Serializable;

/**
 * @description: null
 * @create: Rock Wang  2024-08-10 18:05
 **/
public class InnerClass implements Serializable {

    private static final long serialVersionUID = 1L;



    /**
     *  advantage：
     *  1.JVM 在加载类时会自动确保静态内部类的初始化过程是线程安全的，因此不需要显式的同步机制。
     *  2.Singleton 实例的创建是懒加载的，即只有在调用 getUniqueInstance() 方法时，
     */
    private InnerClass(){

    }

    private static class SingletonHolder{
        private static final InnerClass INSTANCE = new InnerClass();
    };

    public static InnerClass getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }

    private Object readResolve(){
        return getUniqueInstance();
    }
}
