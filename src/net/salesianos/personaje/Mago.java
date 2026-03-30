package net.salesianos.personaje;

public class Mago extends Personaje {
    
    private String elemento;


    public Mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }
}