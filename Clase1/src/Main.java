
/*
Esta es la clase principal de Java, es la que se ejecuta al correr el programa.
Siempre debe de existir una clase principal en un programa de Java.
 */
public class Main {
    /*
    Este es el método principal de Java, es el que se ejecuta al correr el programa.
     */
    public static void main(String[] args) {

        /*
        Este es un comentario multilínea, sirve para explicar o documentar el código
        que se está escribiendo.
        Se inicializa con /* y se cierra con * / (sin espacios entre el asterisco y la diagonal)
         */

        //Este es un comentario de una sola línea, sirve para lo mismo pero solo se puede escribir en una línea.

        /*
        Tipo de datos en Java
        Primitivos: Son los tipos de datos básicos de Java, no se pueden modificar.
        Como los enteros (int), los decimales (double), los booleanos (boolean), etc.

        No primitivos: Son los tipos de datos que se pueden modificar.
        Como los arreglos (arrays), las cadenas (String), etc.
         */

        /*
        Variables: Son espacios en memoria que se reservan para guardar un valor.
        Se declaran con el tipo de dato, un nombre y un valor inicial (opcional).
         */

        /*
        La nomenclatura de las variables es la siguiente:
        - No pueden empezar con un número.
        - No pueden tener espacios.
        - No pueden tener caracteres especiales.
        - No pueden tener acentos.
        - No pueden tener ñ.
        - No pueden tener guiones medios.
        - Utilizamos camelCase (la primera letra de cada palabra va en mayúscula, excepto la primera).
         */

        /*
        Boolean (boolean): Es un tipo de dato que solo puede guardar dos valores: true o false.
         */
        boolean voyAGanar = true;
        /*
        Se puede modificar el valor de una variable (siempre y cuando sea del mismo tipo).
         */
        voyAGanar = false;

        /*
        No se puede asignar un valor que no sea booleano a una variable de tipo booleano.
         */
        //voyAGanar = "Hola";

        /*
        Integer (int): Es un tipo de dato que solo puede guardar números enteros.
         */
        int edad = 24;
        edad = 23 + 1;

        // no se puede hacer:
        //edad = true;

        /*
        Double (double): Es un tipo de dato que solo puede guardar números decimales.
         */
        double precioDelHuevo = 1.5;

        /*
        Float (float): Es un tipo de dato que solo puede guardar números decimales (con menos precisión que el double).
        Se debe de poner una F al final del número para indicar que es un float.
         */
        float PI = 3.1416F;

        /*
        Char (char): Es un tipo de dato que solo puede guardar un caracter.
        Se debe de poner el caracter entre comillas simples.
         */
        char inicial = '4';

        /*
        String (String): Es un tipo de dato que solo puede guardar una cadena de caracteres.
        Se debe de poner la cadena de caracteres entre comillas dobles.
         */
        String nombre = "Rodrigo Antonio";

        /*
        Palabras reservadas de Java:
        Son palabras que no se pueden utilizar como nombres de variables, métodos, clases, etc.
        Ejemplos: boolean, break, char, etc.
         */

        /*
        CICLOS: acá nos quedamos :(
         */

    }
}