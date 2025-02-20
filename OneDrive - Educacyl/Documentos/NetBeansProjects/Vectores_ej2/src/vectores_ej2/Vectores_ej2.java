/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores_ej2;

/**
 *
 * @author angela.canesp
 */
public class Vectores_ej2 {

    /**
     * @param args the command line arguments
     */
   
      public static void main(String[] args) {
        Persona per = new Persona();
        
        Persona[] personas = per.llenarTeclado();
        
        per.visualizarArray(personas);
    }
}
