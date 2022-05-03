package geometria.entidades;

import geometria.interfaces.calculosFormas;

public class Rectangulo extends FormasGeometricas implements calculosFormas{

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    public Rectangulo() {
       
    }

    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese base del rectangulo");
        base = leer.nextFloat();
        System.out.println("Ingrese altura del rectangulo");
        altura = leer.nextFloat();
        return new Rectangulo(base, altura);
    }    

    @Override
    public void calculoArea() {
       float area;
       
       area = base * altura;
       
        System.out.printf("El Area del Rectangulo es: %.3f m2", area);
        System.out.println("");
    }

    @Override
    public void calculoPerimetro() {
        float perimetro;
        
        perimetro = 2 * (base+altura);
        
        System.out.println("El Perimetro del Rectangulo es: " + perimetro + "m");
        System.out.println("");
    }

}
