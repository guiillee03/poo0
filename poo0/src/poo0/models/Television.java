
package poo0.models;


public class Television extends Electrodomestico{
    
    protected static final double PULGADAS_DEF = 20;
    protected static final boolean SINTONIZADOR_DEF = false;

    protected double pulgadas;
    protected boolean sintonizadorTV;

    public Television() {
        super();
        this.pulgadas = PULGADAS_DEF;
        this.sintonizadorTV = SINTONIZADOR_DEF;
    }
    
    public Television(double precio, double peso){
        super(precio, peso);        
        this.pulgadas = PULGADAS_DEF;
        this.sintonizadorTV = SINTONIZADOR_DEF;
    }

    public Television(double pulgadas, boolean sintonizadorTV, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTV = sintonizadorTV;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTV() {
        return sintonizadorTV;
    }

    public void setSintonizadorTV(boolean sintonizadorTV) {
        this.sintonizadorTV = sintonizadorTV;
    }

    @Override
    public double precioFinal() {
        double precio = super.getPrecioBase();
        if(this.pulgadas > 40){
            precio = (precio * 0.3) + precio;
        }
        if(this.sintonizadorTV == true){
            precio += 50;
        }
        return precio;
    }
    
}
