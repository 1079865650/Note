package com.example.note.Study.DesignPattern.CreateType.Singleton;

/**
 * @description: null
 * @create: Rock Wang  2024-08-08 23:06
 **/
public class Singleton {
    // If multiple threads are called, multiple instances will be created
    private static  Singleton uniqueInstance;

    // Keep the constructor of the class private and allow external objects to be created freely
    private Singleton(){

    }

    // Static methods can be called by class name without the need to create class methods.
//    public static Singleton getUniqueInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

    //When multiple threads call getUniqueInstance() for the first time simultaneously,
    // only one thread will create an instance,
    // and the other threads will immediately obtain the instance after it is created.
    public static synchronized Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


}
