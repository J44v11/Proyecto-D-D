package net.salesianos.personaje;

public class Guerrero extends Personaje {

    private String arma;

    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("Te llamas: " + nombre + ", tienes: " + nivel + " niveles, tienes: " + energia
                + " de energia y tu arma es: " + arma);
    }

    public void ataquePesado() {

        gastarEnergia(15);
    }
}