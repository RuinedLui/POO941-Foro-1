/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foro_1;

/**
 *
 * @author luise
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Foro_1 {

 // Map donde la clave es el carnet y el valor es el nombre completo
    static Map<String, String> alumnos = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 2);
    }

    public static void ingresarAlumno() {
        System.out.print("Ingrese el carnet: ");
        String carnet = sc.nextLine();

        System.out.print("Ingrese el nombre completo: ");
        String nombre = sc.nextLine();

        alumnos.put(carnet, nombre);

        System.out.println("Alumno ingresado exitosamente");
    }
    
    public static void buscarAlumno() {
        System.out.print("Ingrese el carnet a buscar: ");
        String carnet = sc.nextLine();
    
        if (alumnos.containsKey(carnet)) {
            System.out.println("Alumno encontrado:");
            System.out.println("Carnet: " + carnet);
            System.out.println("Nombre: " + alumnos.get(carnet));
        } else {
            System.out.println("Alumno no encontrado, no se puede Mostrar");
        }
    }
}
