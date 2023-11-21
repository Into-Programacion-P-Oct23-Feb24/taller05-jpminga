/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cantidad;
        String descripcion;
        double precio;
        double total;
        double descuento = 0.15;

        System.out.println("Ingrese la cantidad: ");
        cantidad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la descripción: ");
        descripcion = entrada.nextLine();
        System.out.println("Ingrese precio del producto; ");
        precio = entrada.nextDouble();
        if (cantidad > 50) {
            total = cantidad * precio * descuento;
        } else {
            total = cantidad * precio;
        }
        System.out.println("***** Factura ********");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Valor unitario: " + precio);
        System.out.println("******El costo de su pedido es: " + total);

    }

}
