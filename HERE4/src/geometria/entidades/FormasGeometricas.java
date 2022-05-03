package geometria.entidades;

import java.util.Scanner;

public abstract class FormasGeometricas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected float radio;
    protected float base;
    protected float altura;

    public FormasGeometricas() {
    
    }

    public FormasGeometricas(float radio) {
        this.radio = radio;
    }

    public FormasGeometricas(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

}
