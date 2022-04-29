package here2;

import electrodomestico.entidades.Electrodomestico;
import electrodomestico.entidades.Lavadora;
import electrodomestico.entidades.Televisor;
import java.util.ArrayList;

public class Electrodomesticos {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        Televisor tv = new Televisor();
        tv.crearTelevisor();
        Televisor tv2 = new Televisor();
        tv2.crearTelevisor();
        Lavadora lv = new Lavadora();
        lv.crearLavadora();
        Lavadora lv2 = new Lavadora();
        lv2.crearLavadora();

        electrodomesticos.add(tv);
        electrodomesticos.add(tv2);
        electrodomesticos.add(lv);
        electrodomesticos.add(lv2);

        Double s = 0.0;
        for (Electrodomestico elec : electrodomesticos) {
            elec.precioFinal();
            System.out.println(elec.getPrecio());
            System.out.println(elec.toString());
            s += elec.getPrecio();
        }
        System.out.println("\n\nPrecio total: $"+s);

    }
}
