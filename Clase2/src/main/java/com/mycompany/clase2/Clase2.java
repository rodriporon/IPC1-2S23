/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2;

/**
 *
 * @author rodri
 */
public class Clase2 {

    public static void main(String[] args) {
        
        /*
        Según lo visto en clase, para declarar una variable
        necesitamos de un tipo (en este caso String) y un identificador 
        usando las reglas para los identificadores que vimos
        en el laboratorio (en este caso cadena).
        */
        String cadena;
        /*
        Recuerden que es opcional asignarle un valor a la variable
        al momento de crearla, (excepto si es una variable constante).
        */
        cadena = "Laboratorio IPC";
        
        /*
        A la variable "numeroDeIpc" se le asignamos
        un valor de tipo entero: 1, para mostrar por
        medio de consola el texto "IPC1"
        */
        int numeroDeIpc = 1;
        
        System.out.println(cadena + numeroDeIpc);
        /*
        La salida en consola es: Laboratorio IPC1,
        pero ¿por qué fue posible utilizar el operador
        "+" para operandos de distinto tipo (String, int)?
        
        Porque en Java cuando tenemos un operador de tipo String (cadena)
        el compilador hace un casteo implícito, es decir, al tipo
        int lo convierte en tipo String para realizar una concatenación
        usando el operador "+".
        
        Formando así, una concatenación de dos textos: Laboratorio IPC + 1
        que se convierte en: Laboratorio IPC1.
        
        */
        /*
        Estructuras de Selección:
        
        IF:
        
        if (condicion) {
            // se ejecuta la instrucción en caso de ser verdadero
        }
        
        ELSE:
        
        if (condicion) {
            // se ejecuta la instrucción en caso de ser verdadero
        } else {
            // se ejecuta la instrucción en caso de NO ser verdadero
        }
        
        ELSE IF:
        
        if (condicion) {
            //Se ejecuta la instrucción en caso de ser verdadero,
            //si no, se pasa a la siguiente evaluación.
        
        } else if (condicion) {
            // se ejecuta la instrucción en caso de ser verdadero
        }
        
        */
        
        double notaMarlon = 60.5;
        
        if (notaMarlon >= 60.5) {
            System.out.println("Marlon casi se queda pero ganó");
        } else {
            System.out.println("Casi bro :(");
        }
        
        /*
        
        Utilizamos el Switch cuando tenemos muchos casos a evaluar, como
        en este caso, donde queremos saber qué día de la semana es, según
        el número ingresado para su evaluación.
        
        Esto se podría hacer de igual forma con if - else if, sin embargo
        es menos escalable y no es una buena práctica cuando existe
        una estructura más precisa para estos casos como el switch.
        
        Su estructura es:
        
        switch (condicion) {
            
        case opcion:
            // instrucciones a ejecutar
            break;
        
        default:
            // instrucciones a ejecutar en caso de no encontrar
        }
        */
        int diaDeLaSemana = 12;
        
        switch (diaDeLaSemana) {
            case 1:
                System.out.println("ES EL DÍA LUNES");
                break;
            case 2:
                System.out.println("ES EL DíA MARTES");
                break;    
            case 3:
                System.out.println("ES EL DÍA MIERCOLES");
                break;
            case 4:
                System.out.println("ES EL DÍA JUEVES");
                break;
            case 5:
                System.out.println("ES EL DÍA VIERNES");
                break;
            default:
                System.out.println("Este día no existe");
                break;
        }
    }
}
