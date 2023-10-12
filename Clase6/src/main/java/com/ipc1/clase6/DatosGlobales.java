/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.clase6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class DatosGlobales implements Serializable {
    private static DatosGlobales instance;
    private Administrador ADMINISTRADOR;
    private ArrayList<Profesor> PROFESORES;
    private ArrayList<Curso> CURSOS;
    
    private DatosGlobales() {
        ADMINISTRADOR = null;
        PROFESORES = new ArrayList<>();
        CURSOS = new ArrayList<>();
    }
    
    public static synchronized DatosGlobales getInstance() {
        if (instance == null) {
            instance = new DatosGlobales();
        }
        
        return instance;
    }
    
    public void setInstance(DatosGlobales newInstance) {
        instance = newInstance;
    }

    public Administrador getADMINISTRADOR() {
        return ADMINISTRADOR;
    }

    public void setADMINISTRADOR(Administrador ADMINISTRADOR) {
        this.ADMINISTRADOR = ADMINISTRADOR;
    }

    public ArrayList<Profesor> getPROFESORES() {
        return PROFESORES;
    }

    public void setPROFESORES(ArrayList<Profesor> PROFESORES) {
        this.PROFESORES = PROFESORES;
    }

    public ArrayList<Curso> getCURSOS() {
        return CURSOS;
    }

    public void setCURSOS(ArrayList<Curso> CURSOS) {
        this.CURSOS = CURSOS;
    }
    
    public void agregarProfesor(Profesor profesor) {
        PROFESORES.add(profesor);
    }
    
    public void agregarCurso(Curso curso) {
        CURSOS.add(curso);
    }
    
    public void actualizarConDatos(DatosGlobales datos) {
        this.ADMINISTRADOR = datos.getADMINISTRADOR();
        this.PROFESORES = datos.getPROFESORES();
        this.CURSOS = datos.getCURSOS();
    }
    
    public void guardarDatos() {
        serializarDatos(this, "datos.dat");
    }
    
    public void serializarDatos(DatosGlobales datos, String rutaArchivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            salida.writeObject(datos);
            System.out.println("Datos serializados correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static DatosGlobales deserializarDatos(String rutaArchivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            DatosGlobales datos = (DatosGlobales) entrada.readObject();
            System.out.println("Datos deserializados correctamente");
            return datos;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
