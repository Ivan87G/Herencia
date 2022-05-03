package geometriaapp;

import geometria.entidades.Circunferencia;
import geometria.entidades.Rectangulo;


public class HERE4 {

    public static void main(String[] args) {
        
        Circunferencia c = new Circunferencia();        
        c.crearCircunferencia();
        c.calculoArea();
        c.calculoPerimetro();
        
        System.out.println("\n");
        
        
        Rectangulo r = new Rectangulo();        
        r.crearRectangulo();
        r.calculoArea();
        r.calculoPerimetro();
      
        
        
        
    }

}
