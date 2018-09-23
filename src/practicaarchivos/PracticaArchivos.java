/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author alba
 */
public class PracticaArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres[] = {
            "Ricardo",
            "Abril",
            "Antonio",
            "Astrik",
            "Efrain", 
            "Orscar",
            "Manuel",
            "Roberto",
            "Eder",
            "Humberto",
            "Jaqueline",
            "Maximiliano",
            "Alejandra",
            "Andres",
            "Esteban"
        
        };
         for (int nombre = 0;
                 nombre < nombres.length; nombre ++){
                 
         //Escribir en el archivo
       try{
           Files.write(Paths.get("nombres.txt"),
                   (nombres[nombre] + "\r\n").getBytes(),
                   StandardOpenOption.APPEND);
       }catch (IOException e) {
       }
         }
    }
    
}
