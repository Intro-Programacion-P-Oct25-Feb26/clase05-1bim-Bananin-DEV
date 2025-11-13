/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Taller06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        String nombre;
        String apellido;
        String usuario;
        double edad;
        String parroquia;
        double diaPago;
        double descuento;
        double membresia;
        double total;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextDouble();
        System.out.println("Ingrese el dia del pago");
        diaPago = entrada.nextDouble();
        
        membresia = 25;
        descuento = membresia*0.05;
        total = membresia-descuento;
        
        if (parroquia.equals("El Valle") || parroquia.equals("El Sagrario") && 
                (diaPago<10)) { 
            System.out.printf("Apto para el descuento,"
                        + "su total es de: \n$%.2f", total);
        } else { 
            System.out.printf("Descuento no otorgado, su total es de: \n$%.2f", membresia);
        }
        
            //else 
                
        
    }
    
}
