package foro_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Foro_1 {

    static Map<String, String> alumnos = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Salir");
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
                    eliminarAlumno();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
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

    public static void eliminarAlumno() {
        System.out.print("Ingrese el carnet a eliminar: ");
        String carnet = sc.nextLine();

        if (alumnos.containsKey(carnet)) {
            alumnos.remove(carnet);
            System.out.println("Alumno eliminado exitosamente");
        } else {
            System.out.println("Alumno no encontrado, No se puede Eliminar");
        }
    }
}