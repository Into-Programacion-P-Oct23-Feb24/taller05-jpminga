/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costo;
        double minutos;
        double total;

        System.out.println("Ingrese el costo por minuto:");
        costo = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de minutos "
                + "consumidos al mes:");
        minutos = entrada.nextDouble();
        total = costo * minutos;

        System.out.printf("El valor mensual a pagar es: "
                + "%.2f", total);
    }

}
