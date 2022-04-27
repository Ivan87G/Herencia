package electrodomestico.entidades;


public class Televisor extends Electrodomestico{
    
    protected Integer resolucion;
    protected Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT,  Double precio, String color, char consumo, Double peso) {
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

    public Televisor crearTelevisor(){
        Televisor televisor;
        crearElectrodomestico();
        return new Televisor(resolucion, sintonizadorTDT, precio, color, consumo, peso);
    }
    
    public void precioFinal(){
        
    }
    
    

   
    
    

}
