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

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}