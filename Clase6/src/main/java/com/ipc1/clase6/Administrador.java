/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.clase6;

import java.io.Serializable;

/**
 *
 * @author rodri
 */
public class Administrador extends Usuario implements Serializable {
    
    public Administrador(String codigo, String contrasena) {
        super(codigo, contrasena);
    }
    
    public Administrador() {
        super("", "");
    }
    
    public void registrarProfesor(String codigo, String contrasena, String nombre, String correo) {
        Profesor profesor = new Profesor(nombre, correo, codigo, contrasena);
        DatosGlobales.getInstance().agregarProfesor(profesor);
    }
    
    
}
