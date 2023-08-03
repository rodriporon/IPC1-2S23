/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ipc1.clase3;

/**
 *
 * @author rodri
 */

/*
Para hacer uso del Scanner se debe hacer su respectiva importación
*/
import java.util.Scanner;


public class Clase3 {
    
    /*
    Creamos una método que nos ayude a reutilizar nuestro código
    para mostrar las tablas de multiplicar, recibe como parámetro
    el número de la tabla que queremos mostrar.
    */
    
    public static void mostrarTablaConFor(int numero) {
        System.out.println("Tabla del " + numero + " hecha con For:");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            
        }
    }
    
    public static void mostrarTablaconWhile(int numero) {
        System.out.println("Tabla del " + numero + " hecha con While:");
        /*
        debemos declarar una variable con nos ayude con
        la condición de finalización del while, sino hicieramos esto
        el while podría ser infinito, y muchas veces no es esto lo que queremos.
        */
        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }
    
    /*
    Ahora hagamos lo mismo de antes pero utilizando una función en vez de un
    método
    */
    
    public static String obtenerTabla(int numero) {
        // numero = 2
        String tabla = "Tabla del " + numero + ":\n";
        /*
        tabla = Tabla del 2:
        
        */
        
        for (int i = 1; i <= 10; i++) {
            // numero = 2
            // 2 * 1
            int resultado = numero * i;
            // resultado = 2
            tabla += numero + " x " + i + " = " + resultado + "\n";
            /*
            tabla = Tabla del 2:
            2 x 1 = 2
            
            */
        }
        
        return tabla;
    }
    
    /*
    Creación del método para almacenar y mostrar las notas de los alumnos
    */
    
    public static void registroDeNotas() {
        Scanner scanner = new Scanner(System.in);
        String[] nombresAlumnos = new String[4];
        double[] notasAlumnos = new double[4];
        /*
        También se podría hacer:
        String[] nombresAlumnos = {"Juan", "María", "Carlos", "Ana"};
        double[] notasAlumnos = {8.5, 9.0, 7.8, 6.5}
        */
        
        /*
        Si los dos arrays son del mismo tamaño es posible utilizar un solo for
        para tener la secuencia de agregar el nombre del alumno junto a su nota.
        
        En este caso lo que hicimos en el laboratorio fue agregar primero todos
        los nombres de los alumnos y por último agregar todas las notas a los arrays
        nombresAlumnos y notasAlumnos, respectivamente.
        */
        
        System.out.println("Registro de Alumnos");
        for (int i = 0; i < nombresAlumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            nombresAlumnos[i] = nombre;
        }
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.print("Ingrese la nota del alumno: ");
            double nota = scanner.nextDouble();
            notasAlumnos[i] = nota;
        }
        System.out.println("Las notas y nombres de los alumnos son:");
        for (int i = 0; i < nombresAlumnos.length; i++) {
            System.out.println("La nota de " + nombresAlumnos[i] + " es: " + notasAlumnos[i]);
        }
    }

    public static void main(String[] args) {
      /*
        Crear un programa que muestre lo siguiente:
        Programa realizado por: <<su nombre>> por medio de una entrada
        del usuario, este programa debe ejecutar un menú que tengas las
        siguientes opciones:
        
        1. Mostrar tabla del 2
        2. Mostrar tabla del 5
        3. Ingresar nombre de alumnos y sus notas.
        4. Salir
        */
        
        /*
        Primero necesitamos recibir el título del programa, por lo que
        instanciamos un objeto scanner de la clase Scanner
        */
        
        Scanner scanner = new Scanner(System.in);
        
        /*
        Pedimos por consola al usuario que ingrese su nombre.
        */
        
        System.out.print("Ingrese su nombre: ");
        
        String nombre = scanner.nextLine();
        
        /*
        Ahora en la variable nombre contendrá lo ingresado por medio de la consola
        */
        
        /*
        Realizamos el menú usando un do-while, para ello necesitamos
        una variable que guarde la opción que el usuario escogió.
        */
        
        int opcion;
        
        /*
        El do-while funciona de la siguiente manera:
        siempre se ejecutará por lo menos una vez lo contenido
        dentro de las llaves, luego se evaluará la condición del while
        y si no se cumple se acaba el ciclo, caso contrario si la condición es verdadera.
        
        */
        
        do {
            System.out.println("Programa realizado por: " + nombre);
            System.out.println("1. Mostrar tabla del 2");
            System.out.println("2. Mostrar tabla del 5");
            System.out.println("3. Ingresar nombre y nota de alumnos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            if (opcion == 1) {
                System.out.println("***TABLA DEL 2***");
                mostrarTablaConFor(2);
                mostrarTablaconWhile(2);
            } else if (opcion == 2) {
                System.out.println("***TABLA DEL 5***");
                
                String tablaDelCinco = obtenerTabla(5);
                System.out.println(tablaDelCinco);
            } else if (opcion == 3){
                /*
                Para esta sección usaremos dos arreglos, uno
                almacenerá los nombres de los alumnos y el otro
                las notas de cada uno.
                */
                registroDeNotas();
            } else {
                /*
                Si no se ingresa una opción válida o existente en
                el menú, entra a este else.
                */
                System.out.println("Ingrese una opción correcta.");
            }
            
        } while (opcion != 4);
    }
}
