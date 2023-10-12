/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listmodels;

import com.ipc1.clase6.Curso;
import com.ipc1.clase6.DatosGlobales;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author rodri
 */
public class CursosProfesorModel extends AbstractListModel<String> {
    DatosGlobales datosGlobales = DatosGlobales.getInstance();
    ArrayList<Curso> cursos = datosGlobales.getCURSOS();
    
    @Override
    public int getSize() {
        return cursos.size();
    }
    
    @Override
    public String getElementAt(int index) {
        Curso curso = cursos.get(index);
        
        String nombreCursoConInfo = curso.getNombre() + " - " + curso.getAlumnos().size() + " alumnos";
        return nombreCursoConInfo;
    }
    
    /**
     * Busca un curso por su nombre
     * @param nombreCurso
     * @return 
     */
    public Curso buscarCursoPorNombre(String nombreCurso) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equals(nombreCurso)) {
                return curso;
            }
        }
        return null;
    }
            
    
}
