/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author UTPL
 */
public class NewClass {
    public static void main(String[] args) {
        
        // Condicionales simplesmain
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // ingresar por teclado el limite de notas
        //double limiteNotas = 6.9;

        System.out.println("Ingrese un valor para analizar");
        double promedio = entrada.nextDouble();
        System.out.println("Ingresar el limite de notas");
        double limiteNotas = entrada.nextDouble();        
        //double promedio = 7.5;

        if (promedio >= limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio == limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio < limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }
    }
    
}
