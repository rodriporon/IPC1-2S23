/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Analizadores {
    
    public static List<String[]> analizarProfesoresCsv(File profesoresCsvFile) {
        List<String[]> parsedValues = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(profesoresCsvFile)) {
            
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] values = line.split(",");
                parsedValues.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parsedValues;
    }
}
