/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.clase6;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Curso implements Serializable {
    private String codigo;
    private String nombre;
    private int creditos;
    private ArrayList<Alumno> alumnos;
    private Profesor profesor;

    public Curso(String codigo, String nombre, int creditos, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.alumnos = new ArrayList<>();
        this.profesor = profesor;
        
        /*
        para simular que inician estudiantes
        */
        Alumno alumno1 = new Alumno("Juanito", "j@gmail.com", "0002", "12345");
        Alumno alumno2 = new Alumno("Juanito", "j@gmail.com", "0002", "12345");
        this.alumnos.add(alumno1);
        this.alumnos.add(alumno2);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }



    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
