/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo0;


import poo0.models.Directivo;
import poo0.models.Empleado;
import poo0.models.Oficial;
import poo0.models.Operario;
import poo0.models.Tecnico;


public class Start {
    public static void main(String[] args) {
         Empleado E1 = new Empleado("Rafa");
         Directivo D1 = new Directivo("Mario");
         Operario OP1 = new Operario("Alfonso");
         Oficial OF1 = new Oficial("Luis");
         Tecnico T1 = new Tecnico("Pablo");
        
         System.out.println(E1);
         System.out.println(D1);
         System.out.println(OP1);
         System.out.println(OF1);
         System.out.println(T1);
        
    }
}
