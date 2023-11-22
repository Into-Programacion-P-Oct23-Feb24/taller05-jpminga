/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double total;

        System.out.println("Ingrese el costo del CPU:");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del teclado:");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el costo de la pantalla:");
        pantalla = entrada.nextDouble();
        System.out.println("Ingrese el costo del raton:");
        raton = entrada.nextDouble();
        total = cpu + teclado + pantalla + raton;

        System.out.printf("cpu: %.2f\nteclado: %.2f\npantalla: %.2f\n"
                + "raton: %.2f\nEl total de la computadora es: %.2f",
                cpu, teclado, pantalla, raton, total);
    }

}
