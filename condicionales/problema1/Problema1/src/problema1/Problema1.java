/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double costo;
        int kilovatio;
        double descuento = 0.10;
        double valorfactura;
        System.out.println("Ingrese su edad: ");

        edad = entrada.nextInt();
        System.out.println("Costo por kilovatio/hora: ");

        costo = entrada.nextDouble();
        System.out.println("Kilovatios consumidos: ");
        kilovatio = entrada.nextInt();

        if (edad > 62) {
            valorfactura = costo * kilovatio * descuento;
        } else {
            valorfactura = costo * kilovatio;
        }

        System.out.println("********* PLANILLA DE LUZ ******** ");
        System.out.println("Valor a cancelar: " + valorfactura);

    }

}
