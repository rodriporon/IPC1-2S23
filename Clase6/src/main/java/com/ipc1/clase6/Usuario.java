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
public class Usuario implements Serializable {
    private String codigo;
    private String contrasena;
    
    public Usuario (String codigo, String contrasena) {
        this.codigo = codigo;
        this.contrasena = contrasena;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
