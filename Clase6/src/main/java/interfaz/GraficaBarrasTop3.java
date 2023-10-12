/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import com.ipc1.clase6.Curso;
import com.ipc1.clase6.DatosGlobales;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author rodri
 */
public class GraficaBarrasTop3 extends JFrame {
    
    public GraficaBarrasTop3 (String nombreVentana, String nombreGrafica) {
        super(nombreVentana);
        JFreeChart barras = ChartFactory.createBarChart(nombreGrafica, 
        "Cursos", "Cantidad alumnos", crearDataset(),
        PlotOrientation.VERTICAL, true, true, false);
        
        ChartPanel chartPanel = new ChartPanel(barras);
        chartPanel.setPreferredSize(new Dimension(560, 360));
        setContentPane(chartPanel);

    }
    
        private CategoryDataset crearDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Curso curso : DatosGlobales.getInstance().getCURSOS()) {
            dataset.addValue(curso.getAlumnos().size(), curso.getNombre(), "Cursos");
        }
        return dataset;
    }
    
    
}
