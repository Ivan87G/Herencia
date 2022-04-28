package here2;

import electrodomestico.entidades.Lavadora;
import electrodomestico.entidades.Televisor;

public class Electrodomesticos {

    public static void main(String[] args) {

        Televisor tv = new Televisor();
        Lavadora lv = new Lavadora();

        tv.crearTelevisor();
        tv.precioFinal();
        System.out.println("Precio Final del Televisor: " + tv.getPrecio());
        
    }
}
