package geometria.entidades;

import geometria.interfaces.calculosFormas;

public class Circunferencia extends FormasGeometricas implements calculosFormas {

    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        super(radio);
    }

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese radio de la circunferencia en metros");
        radio = leer.nextFloat();

        return new Circunferencia(radio);
    }

    @Override
    public void calculoArea() {
        double area;

        area = PI * radio * radio;

        System.out.printf("El Area de la Circunferencia es: %.3f m", area);
        System.out.println("");

    }

    @Override
    public void calculoPerimetro() {
        float perimetro;

        perimetro = (2 * PI * radio);

        System.out.printf("El Perimetro de la Circunferencia es: %.3f m", perimetro);
        System.out.println("");
    }

}
