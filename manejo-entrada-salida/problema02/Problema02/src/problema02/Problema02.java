/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double h1;
        double h2;
        double h3;
        double total;

        System.out.println("Ingrese el gasto del primer hijo:");
        h1 = entrada.nextDouble();
        System.out.println("Ingrese el gasto del segundo hijo:");
        h2 = entrada.nextDouble();
        System.out.println("Ingrese el gasto del tercer hijo:");
        h3 = entrada.nextDouble();
        total = h1 + h2 + h3;

        System.out.printf("Hijo 1: %.2f\nHijo 2: %.2f\nHijo 3: %.2f\n"
                + "El total de gastos de los hijos del padre de familia es: %.2f",
                h1, h2, h3, total);
    }

}
