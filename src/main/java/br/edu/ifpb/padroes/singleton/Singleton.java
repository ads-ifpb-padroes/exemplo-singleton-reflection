package br.edu.ifpb.padroes.singleton;

public class Singleton {

    private static final Singleton INSTANCE;

    private Singleton() {

    }

    static {
        INSTANCE = new Singleton();
    }


    public static Singleton getInstance() {
        return INSTANCE;
    }

}
