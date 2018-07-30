package br.edu.ifpb.padroes.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Loader {

    /*
        O código abaixo quebra a idéia do Singleton,
        fazendo com que seja possível criar quantas
        instâncias forem necessárias, a partir do
        objeto Constructor
     */
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton primeiraInstancia = Singleton.getInstance();
        Singleton segundaInstancia = null;

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        for(Constructor c : constructors) {
            c.setAccessible(true);
            segundaInstancia = (Singleton) c.newInstance();
            break;
        }
        System.out.println(primeiraInstancia.hashCode());
        System.out.println(segundaInstancia.hashCode());
    }

}
