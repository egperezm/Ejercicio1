/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diferenciadeedad;

/**
 *
 * @author perez
 */

    /**
     * @param args the command line arguments
     */
 import java.util.Scanner;

public class DiferenciadeEdad {
    public static void main(String[] args) {
        
        // Solicitar el año de nacimiento de las dos personas
        Scanner scanner = new Scanner(System.in); {
        
            // Solicitar el año de nacimiento de las dos personas
            System.out.print("Ingrese el año de nacimiento de la primera persona: ");
            int anioNacimiento1 = scanner.nextInt();
            
            System.out.print("Ingrese el año de nacimiento de la segunda persona: ");
            int anioNacimiento2 = scanner.nextInt();
            
            // Calcular la diferencia de edad
            int diferencia = Math.abs(anioNacimiento1 - anioNacimiento2);
            
            // Determinar quién es mayor
            if (anioNacimiento1 < anioNacimiento2) {
                System.out.println("La primera persona es mayor por " + diferencia + " años.");
            } else if (anioNacimiento1 > anioNacimiento2) {
                System.out.println("La segunda persona es mayor por " + diferencia + " años.");
            } else {
                System.out.println("Ambas personas tienen la misma edad.");
            }
        }
    }
}

