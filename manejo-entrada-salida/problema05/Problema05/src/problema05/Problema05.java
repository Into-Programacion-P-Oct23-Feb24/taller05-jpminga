/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double valor_mensual;

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el costo de netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el costo de youtube premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el costo de dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el costo de spotify");
        spotify = entrada.nextDouble();

        valor_mensual = (netflix + youtube + dropbox + spotify);

        if (edad < 30) {
            valor_mensual = valor_mensual - (valor_mensual * 0.20);
        }
        System.out.printf("El total a pagar al mes es: %.2f",
                valor_mensual);
    }

}
