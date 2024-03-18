package com.example;

import com.lista.listacompra.supermercado.Alcampo;
import com.lista.listacompra.supermercado.Mercadona;

public class Main {
    public static void main(String[] args) {
        Alcampo a=new Alcampo();
        Mercadona m=new Mercadona();

        System.out.println(a.busqueda("patatas").get(0));
        System.out.println(m.busqueda("cebolla").get(0));
    }
}