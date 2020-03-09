package com.dpj.singleton;

public class SingletonMain {
    public static void main(String[] args){
        Singleton object = Singleton.getInstance();
        object.showMessage();

    }
}
