/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double total;
        double impuesto;

        System.out.println("Ingrese la marca del carro: ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del carro: ");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo: ");
        costo = entrada.nextDouble();
        switch (origen) {
            case "Alemania":
                impuesto = 0.20;
                break;
            case "Japón ":
                impuesto = 0.30;
                break;
            case "Italia":
                impuesto = 0.15;
                break;
            case "USA":
                impuesto = 0.08;

                break;

            default:
                throw new AssertionError();
        }
        total=costo*impuesto+costo;
        System.out.println("****** IMPUESTO DE CARRO ***** ");
        System.out.println("Impuesto por pagar: "+impuesto*100+"%");
        System.out.println("Precio de venta: "+total);
    }

}
