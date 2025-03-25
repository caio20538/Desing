package com.dio.desingPatterns.singleton;

/**
 * Singleton "apressado"
 * @author caio20538
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();;

    private SingletonEager() {
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
