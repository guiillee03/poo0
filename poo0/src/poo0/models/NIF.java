
package poo0.models;

import java.util.Scanner;



public class NIF {
    
    private int numeroDNI;
    
    private char letraDNI;
    public NIF(){

}
    
    public NIF(int numeroDNI){
        this.numeroDNI = numeroDNI;
        letraDNI = calcularLetra();
        
    }
    
    private char calcularLetra(){
        char [] letrasDNI ={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z','S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letraDNI = letrasDNI[numeroDNI % 23];
    }
    public void leer(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce la letra del dni ");
            numeroDNI = sc.nextInt();
        }while(numeroDNI <= 0);
        letraDNI = calcularLetra();        
    }

    @Override
    public String toString() {
        return "NIF{" + "numeroDNI=" + numeroDNI + ", letraDNI=" + letraDNI + '}';
    }
    
}

