package com.alan;

public class Main {

    public static void main(String[] args) {

        perro lomito=new perro();
        lomito.nombre="Chems";
        lomito.edad=1;
        lomito.raza=("generica");
        lomito.tamanio="grande";
        lomito.comer();
        lomito.caracteristicas();

        perro lomito2=new perro();
        lomito2.nombre="Firulais";
        lomito2.edad=15;
        lomito.raza="pug";
        lomito2.tamanio="chico";
        lomito2.caracteristicas();
        lomito2.dormir();

        perro lomito3 = new perro("Pancho");//Constructor que funciona con parametros
        perro lomito4 = new perro("Maylo",2,"Salchicha", "Chico");

        System.out.println(lomito4.nombre);
    }
}
