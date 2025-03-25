package com.dio.desingPatterns.strategy;

public class test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);

        robo.mover();
        robo.mover();
        System.out.println();

        robo.setStrategy(defensivo);

        robo.mover();
        robo.mover();
        System.out.println();

        robo.setStrategy(ofensivo);

        robo.mover();
        robo.mover();
        System.out.println();
    }
}
