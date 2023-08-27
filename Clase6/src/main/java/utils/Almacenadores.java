/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.List;
import tablemodels.ProfesorTableModel;

/**
 *
 * @author rodri
 */
public class Almacenadores {
    public static ProfesorTableModel profesorTableModel;
    
    public static void agregarProfesores (List<String[]> parsedValues) {
        for (String[] values : parsedValues) {
            if (values.length >= 3 ) {
                String codigo = values[0];
                String nombre = values[1];
                String correo = values[2];
                String contrasena = "1234";
                profesorTableModel.agregarProfesor(codigo, contrasena, nombre, correo);
            }
        }
    }
    
}
