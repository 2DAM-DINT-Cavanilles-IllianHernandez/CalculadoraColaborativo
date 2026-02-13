/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoracolaborativo;

/**
 *
 * @author illia
 */
public class CalculadoraColaborativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Multiplicacion multi = new Multiplicacion();
        Suma sum = new Suma();
        Resta rest = new Resta();
    
        int multiplicacion = multi.multiplicar(8, 8);
        int suma = sum.sumar(1, 1);
        int resta = rest.resta(10, 3);
        
        System.out.println("Multiplicacion: " + multiplicacion); //4*9
        System.out.println("Suma: " + suma); //2+5
        System.out.println("resta: " + resta); //8-2

    }
}
