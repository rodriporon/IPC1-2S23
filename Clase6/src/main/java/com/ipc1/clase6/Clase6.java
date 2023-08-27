/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ipc1.clase6;

import interfaz.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Clase6 {

    public static void main(String[] args) {
        DatosGlobales datosGlobales = DatosGlobales.getInstance();
        DatosGlobales datosDeserializados = DatosGlobales.deserializarDatos("datos.dat");
        
        if (datosDeserializados != null) {
            datosGlobales.actualizarConDatos(datosDeserializados);
        } else {
            Administrador admin = new Administrador("admin", "admin");
            ArrayList<Profesor> profesores = new ArrayList<>();
            datosGlobales.setADMINISTRADOR(admin);
            datosGlobales.setPROFESORES(profesores);
        }
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        
        
        final DatosGlobales datosParaGuardar = datosGlobales;
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            datosParaGuardar.guardarDatos();    
        }));
    }
}
