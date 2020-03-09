package com.dpj.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Single message out");
    }

    static {
        try{
            instance = new Singleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured");
        }
    }
}
