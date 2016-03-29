/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leearchivos;

import flexjson.JSONDeserializer;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author luisza
 */
public class LeeArchivos {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Lector lector = new Lector();
        String texto = lector.read_file("/home/luisza/Escritorio/ejemplo.txt");
        System.out.println(texto.charAt(0));
        Escritor escritor = new Escritor();
        escritor.write_file("/home/luisza/Escritorio/ejemplo.txt", "Escribiendo algo");
        texto = lector.read_file("/home/luisza/Escritorio/ejemplo.txt"); 
        System.out.println(texto);
        
        */

        Lector lector = new Lector();
        Escritor escritor = new Escritor();
/*        
         
        String text = "Esto es un ejemplo \n1.\n2.\n3.";
        escritor.write_file("config.properties", text);
        System.out.println(lector.read_file("config.properties"));     
       */
       
        //escritor.with_obj_in_file_json("estudiantes.json", Estudiante.get_estudiantes());
        ArrayList<Estudiante> estudiantes = lector.read_json("estudiantes.json");
        
        for(int x=0; x<estudiantes.size(); x++){
            System.out.println(estudiantes.get(x));
        }
        
        /*
        escritor.with_obj_in_file_xml("estudiantes.xml", Estudiante.get_estudiantes());
        ArrayList<Estudiante> estudiantes = lector.read_xml("estudiantes.xml");
        
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        
        
        /*
        ConfigManager cm = ConfigManager.getInstance();
        cm.load_config();
        System.out.println(cm.getProperty("formato"));
        cm.setProperty("base_de_datos", "db.sqlite");
        cm.save_config();
        */
    }
    
}
