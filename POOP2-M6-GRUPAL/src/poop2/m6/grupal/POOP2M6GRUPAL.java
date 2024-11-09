/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2.m6.grupal;

import java.util.Scanner;
import poop2.m6.grupal.Clases.Deportista;
import poop2.m6.grupal.Clases.Doctor;

/**
 *
 * @author IRENYA FORTIN
 */
public class POOP2M6GRUPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        int opcion;
        
        

        do {
            System.out.println("Ingrese los datos de la persona: ");
            System.out.print("DNI: ");
            String dni = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nacionalidad: ");
            String nacionalidad = scanner.nextLine();
            
            System.out.println("----------------------: ");
            System.out.println("Seleccione el oficio de la persona a incluir:");
            System.out.println("1. Doctor");
            System.out.println("2. Deportista");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            System.out.println("----------------------: ");
            
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Especialidad: ");
                String especialidad = scanner.nextLine();
                Doctor doctor = new Doctor(dni, nombre, apellido, edad, nacionalidad, especialidad);
                doctor.mostrarDatos();
                System.out.println("----------------------: ");
            } else if (opcion == 2) {
                System.out.print("Deporte: ");
                String deporte = scanner.nextLine();
                Deportista deportista = new Deportista(dni, nombre, apellido, edad, nacionalidad, deporte);
                deportista.mostrarDatos();
                System.out.println("----------------------: ");
            } else if (opcion != 0) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        System.out.println("Gracias por usar el sistema, hasta pronto!");
        scanner.close();
    }
}