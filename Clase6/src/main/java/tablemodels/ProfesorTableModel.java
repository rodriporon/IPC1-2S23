/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodels;

import com.ipc1.clase6.Administrador;
import com.ipc1.clase6.DatosGlobales;
import com.ipc1.clase6.Profesor;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodri
 */
public class ProfesorTableModel extends AbstractTableModel {
    
    DatosGlobales datosGlobales = DatosGlobales.getInstance();
    Administrador administrador = datosGlobales.getADMINISTRADOR();
    
    private String[] columnNames = {"Codigo", "Nombre", "Correo"};
    
    public void agregarProfesor(String codigo, String contrasena, String nombre, String correo) {
        administrador.registrarProfesor(codigo, contrasena, nombre, correo);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return datosGlobales.getPROFESORES().size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Profesor profesor = datosGlobales.getPROFESORES().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return profesor.getCodigo();
            case 1:
                return profesor.getNombre();
            case 2:
                return profesor.getCorreo();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
}
