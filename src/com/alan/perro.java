package com.alan;

public class perro {

    String nombre;
    String raza;
    int edad;
    String tamanio;

    //Consttructor utilizado para darle valores inicializados
    public perro (){//Posee el mismo nombre de la clase
    }

    public perro(String nombre){
        this.nombre=nombre;
    }

    public perro(String nombre, int edad, String raza, String tamanio){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
        this.tamanio=tamanio;
    }

    public void caracteristicas(){
        System.out.println("Hola, mi nombre es " + this.nombre + "Soy de raza " + this.raza + " tnego" + edad + "años. Soy de tamaño" + this.tamanio);
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
}
