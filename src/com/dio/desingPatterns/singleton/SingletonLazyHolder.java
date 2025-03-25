package com.dio.desingPatterns.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 *
 * @author caio20538
 */

public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();;

    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }
}
