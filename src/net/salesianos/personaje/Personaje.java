package net.salesianos.personaje;

public class Personaje {

    protected String nombre;
    protected int nivel;
    protected int energia;


    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
    }
}