package electrodomestico.entidades;

public class Lavadora extends Electrodomestico {

    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga");
        carga = leer.nextDouble();

        return new Lavadora(carga, precio, color, consumo, peso);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }
    }
    
}
