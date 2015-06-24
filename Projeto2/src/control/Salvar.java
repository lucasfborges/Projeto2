/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import entidade.Modelo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Lucas
 */
public class Salvar {
    
    public static int SUCESSO = 1;
    public static int ERRO = 0;
    public static int salvar(Modelo model, File caminho){
        //Incluir uma instancia para o Xstream
        XStream xstream = new XStream(new DomDriver());        
        String xml1 = xstream.toXML(model);        
        
        //Salvar o modelo no formato xml
        try (PrintWriter writer = new PrintWriter(caminho.getAbsolutePath())) {
            writer.println(xml1);
            writer.close();
            return SUCESSO;
        } catch (FileNotFoundException e){
            return ERRO;
        }
    }
}