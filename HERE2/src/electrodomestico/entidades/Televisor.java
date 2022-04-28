package electrodomestico.entidades;

public class Televisor extends Electrodomestico {

    protected Integer resolucion;
    protected Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese Medida del Televisor en Pulgadas");
        resolucion = leer.nextInt();
        System.out.println("Posee Sintonizador TDT?");
        String resp = leer.next();
        sintonizadorTDT = resp.equalsIgnoreCase("si");
        return new Televisor(resolucion, sintonizadorTDT, precio, color, consumo, peso);
    }  

    @Override
    public void precioFinal() {
        super.precioFinal();
         if (resolucion > 40) {
            precio += (precio * 0.3);
        }
        if (sintonizadorTDT) {
            precio += 500;
        }        
    }

}
