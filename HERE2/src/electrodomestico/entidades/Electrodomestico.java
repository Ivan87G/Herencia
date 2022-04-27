package electrodomestico.entidades;

import java.util.Scanner;


public class Electrodomestico {
    
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, Double peso) {
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

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        
    }
    
    public void comprobarColor(String color){
        
    }
    
    public Electrodomestico crearElectrodomestico(){
        System.out.println("Ingrese Precio");
        precio = leer.nextDouble();
        
        return new Electrodomestico(precio, color, consumo, peso);
    }
    
    public void precioFinal(){
        
    }
    

}
