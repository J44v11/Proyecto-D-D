package net.salesianos.personaje;

public class Guerrero extends Personaje {

    private String arma;

    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }
}