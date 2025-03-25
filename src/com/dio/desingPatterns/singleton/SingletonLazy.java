package com.dio.desingPatterns.singleton;

/**
 * Singleton "peguiçoso"
 * @author caio20538
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance(){
        if (instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
