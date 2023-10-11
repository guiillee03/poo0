
package poo0.models;


public class Lavadora extends Electrodomestico{
    protected static final double CARGA_DEF = 5;
    protected double carga;

    public Lavadora() {
        super();
        this.carga = CARGA_DEF;
    }
    
    public Lavadora( double precio, double peso){
        super(precio,peso);
        this.carga = CARGA_DEF;
    }
    
    public Lavadora(double carga){
        super();
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
         double precio = super.getPrecioBase();
        if(carga > 30){
            precio += 50;
        }
        return precio;
    }
    
        
}
