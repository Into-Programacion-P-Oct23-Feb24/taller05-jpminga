/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double descuento = 0.0;
        int dias;
        double precio;
        double subtotal;
        double total;

        System.out.println("Ingrese el número de días de hospedaje: ");
        dias = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el precio de la habitación:");
        precio = entrada.nextDouble();

        if (dias > 5) {
            descuento = 0.10;
        }
        if (dias > 10) {
            descuento = 0.15;
        }
        if (dias > 15) {
            descuento = 0.20;
        }else {
            }
        subtotal = precio * dias;
        total = subtotal-(subtotal*descuento);
        System.out.println("****** HOSPEDAJE *******");
        System.out.println("Subtotal a pagar: " + subtotal);
        System.out.println("Descuento: " + descuento * 100 + "%");
        System.out.println("Total a pagar: "+total);

    }

}
