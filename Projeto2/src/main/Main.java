/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import control.GeradorHTML;
import control.GeradorPHP;
import java.io.File;
import entidade.Modelo;
/**
 *
 * @author Lucas
 */
public class Main
{

    public static void main(String args[]) {

     //           new TextEditor().setVisible(true);
        Modelo modelo = new Modelo();
        modelo.setName("mey prodeto");
        modelo.setText("Tralalalala");
        GeradorHTML.gerar(modelo, new File("/Users/Lucas/Documents/GitHub/Projeto2/Projeto2/src/templates/teste.html"));
        GeradorPHP.gerar(modelo, new File("/Users/Lucas/Documents/GitHub/Projeto2/Projeto2/src/templates/templatesPHP/geradorPHP.php"));
    }
}