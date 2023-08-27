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
public class Profesor extends Usuario implements Serializable {
    private String nombre;
    private String correo;

    public Profesor(String nombre, String correo, String codigo, String contrasena) {
        super(codigo, contrasena);
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
        
    
    
}
