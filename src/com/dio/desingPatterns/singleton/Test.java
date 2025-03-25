package com.dio.desingPatterns.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy singletonLaza = SingletonLazy.getInstance();
        System.out.println(singletonLaza);
        singletonLaza = SingletonLazy.getInstance();
        System.out.println(singletonLaza);

        System.out.println();

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        System.out.println();

        SingletonLazyHolder singletonLazaLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazaLazyHolder);
        singletonLazaLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazaLazyHolder);
    }
}
