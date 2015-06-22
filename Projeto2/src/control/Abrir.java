/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
/**
 *
 * @author Lucas
 */
import entidade.Modelo;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Abrir {
    
    public static int SUCESSO = 1;
    public static int ERRO = 0;
    
    public static int abrir(File arquivo, Modelo modelo)   {
        try{
            XStream xstream = new XStream(new DomDriver()); 
            String content = new Scanner(arquivo).useDelimiter("\\Z").next();
            modelo = (Modelo)xstream.fromXML(content);
            return  SUCESSO;
        }
        catch(FileNotFoundException e)
        {
            return ERRO;
        }
        
        
    }
}
