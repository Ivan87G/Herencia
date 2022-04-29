package electrodomestico.entidades;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double precio;
    protected String color;
    protected String consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso ;
    }
    
    

    public void comprobarConsumoEnergetico(String letra) {
        if (((((letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b")) || letra.equalsIgnoreCase("c")) || letra.equalsIgnoreCase("d")) || letra.equalsIgnoreCase("e")) || letra.equalsIgnoreCase("f")) {
            consumo = letra;
        } else {
            consumo = "f";
        }
    }

    public void comprobarColor(String color) {
        if ((((color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro")) || color.equalsIgnoreCase("rojo")) || color.equalsIgnoreCase("azul")) || color.equalsIgnoreCase("gris")) {
            this.color = (color);
        } else {
            this.color = ("Blanco");
        }
    }

    public Electrodomestico crearElectrodomestico() {
        
        precio = 1000d;

        System.out.println("Ingrese Color");
        color = leer.next();
        comprobarColor(getColor());

        System.out.println("Ingrese Consumo");
        consumo = leer.next();
        comprobarConsumoEnergetico(getConsumo());

        System.out.println("Ingrese Peso");
        peso = leer.nextDouble();

        return new Electrodomestico(precio, color, consumo, peso);
    }

    public void precioFinal() {
        if (consumo.equalsIgnoreCase("a")) {
            precio += 1000;
        }
        if (consumo.equalsIgnoreCase("b")) {
            precio += 800;
        }
        if (consumo.equalsIgnoreCase("c")) {
            precio += 600;
        }
        if (consumo.equalsIgnoreCase("d")) {
            precio += 500;
        }
        if (consumo.equalsIgnoreCase("e")) {
            precio += 300;
        }
        if (consumo.equalsIgnoreCase("f")) {
            precio += 100;
        }
        if (peso >= (1) && peso <= 19) {
            precio += 100;
        }
        if (peso >= (20) && peso <= 49) {
            precio += 500;
        }
        if (peso >= (50) && peso <= 79) {
            precio += 800;
        }
        if (peso >= 80) {
            precio += 1000;
        }
    }

}
