
package poo0.models;


public class Electrodomestico {
    
    
    protected static final double PRECIO_DEF = 100;
    protected static final String COLOR_DEF = "Blanco";
    protected static final char CONSUMO_DEF = 'F';
    protected static final double PESO_DEF = 5;
    
    private static String [] listaColores = {"blanco", "negro", "rojo", "azul", "gris"};
    
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
 
    
    public Electrodomestico(){
        this.precioBase = PRECIO_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }
    
    public Electrodomestico(double precio, double peso){
        this();
        this.peso = peso;
        this.precioBase = precio;
        
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(color);
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
        
        if(letra < 'A' && letra >'F'){
            letra = CONSUMO_DEF;
        }
       return letra;
    }
    
    private String comprobarColor(String color){
        for (int i = 0; i < listaColores.length - 1; i++) {
            if(!listaColores[i].equals(color)){
                color = COLOR_DEF;
                break;
            }
        }
        return color;
    }  
        public double precioFinal(){
        switch (this.consumoEnergetico) {
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;
            case 'D':
                this.precioBase += 50;
                break;
            case 'E':
                this.precioBase += 30;
                break;
            case 'F':
                this.precioBase += 10;
                break;
            default:
                break;
        }
        if(this.peso > 80){
                this.precioBase += 100;
            }else if(this.peso > 50 && peso <= 79){
                this.precioBase += 80;
            }else if(this.peso > 20 && peso <= 49){
                this.precioBase += 50;
            }else if(this.peso >0 && peso <=19){
                this.precioBase += 10;
            }
        return precioBase;
        }
    
    
}
