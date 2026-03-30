import net.salesianos.personaje.Guerrero;
import net.salesianos.personaje.Mago;
import net.salesianos.personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {

        
        Personaje viajero = new Personaje("Eldrin", 3);

        viajero.entrenar(4);
        viajero.gastarEnergia(30);
        viajero.mostrarInfo();
        Personaje.mostrarTotalPersonajes();


        Guerrero thorak = new Guerrero("Thorak", 5, "Hacha doble");

        thorak.ataquePesado();
        thorak.descansar(10);
        thorak.mostrarInfo();
        Personaje.mostrarTotalPersonajes();


        Mago lyra = new Mago("Lyra", 4, "Hielo");
        
        lyra.ataqueElemental();
        lyra.entrenar(2);
        lyra.mostrarInfo();
        Personaje.mostrarTotalPersonajes();

    }
}
