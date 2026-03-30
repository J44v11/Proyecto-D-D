package net.salesianos.personaje;

public class Personaje {

    protected String nombre;
    protected int nivel;
    protected int energia;
    public static int totalPersonajes = 0;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
        totalPersonajes++;
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

    public void entrenar(int x) {
        if (x > 0) {
            this.nivel += x;
        } else {
            System.out.println("No se puede entrenar 0 niveles o niveles negativos.");
        }
    }

    public void descansar(int x) {
        if (x > 0) {
            this.energia += x;
            if (this.energia > 100) {
                this.energia = 100;
            }
        } else {
            System.out.println("No se puede aumentar 0 niveles de energia ni energia negativa.");
        }
    }

    public void gastarEnergia(int x) {
        if (x > 0) {
            this.energia -= x;
            if (this.energia < 0) {
                this.energia = 0;
            }
        } else {
            System.out.println("No se puede gastar 0 niveles de energia o energia negativa.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Te llamas: " + nombre + ", tienes: " + nivel + " niveles, y tienes: " + energia + " de energia");
    }

    public static void mostrarTotalPersonajes() {
    System.out.println("Total de personajes creados: " + totalPersonajes);
    }
}