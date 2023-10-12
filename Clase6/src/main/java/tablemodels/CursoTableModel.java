/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodels;

import com.ipc1.clase6.Administrador;
import com.ipc1.clase6.Curso;
import com.ipc1.clase6.DatosGlobales;
import com.ipc1.clase6.Profesor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodri
 */
public class CursoTableModel extends AbstractTableModel {
    
    DatosGlobales datosGlobales = DatosGlobales.getInstance();
    Administrador administrador = datosGlobales.getADMINISTRADOR();
    
    private String[] columnNames = {"Codigo", "Nombre", "Creditos", "Alumnos", "Profesor"};

    public void agregarCurso(String codigo, String nombre, int creditos, String nombreProfesor) {
        
        Profesor profesor = buscarProfesorPorNombre(nombreProfesor);
        
        if (profesor != null) {
            Curso curso = new Curso(codigo, nombre, creditos, profesor);
            datosGlobales.agregarCurso(curso);
            fireTableDataChanged();
        } else {
            System.out.println("El profesor no existe");
        }
        
        
    }
    
    public Profesor buscarProfesorPorNombre(String nombreProfesor) {
        for (Profesor profesor : datosGlobales.getPROFESORES()) {
            if (profesor.getNombre().equals(nombreProfesor));
            return profesor;
        }
        return null;
    }
    
    @Override
    public int getRowCount() {
        return datosGlobales.getCURSOS().size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Curso curso = datosGlobales.getCURSOS().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return curso.getCodigo();
            case 1:
                return curso.getNombre();
            case 2:
                return curso.getCreditos();
            case 3:
                return curso.getAlumnos().size();
            case 4:
                return curso.getProfesor().getNombre();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    
    
}
