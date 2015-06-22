/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidade.Modelo;
import java.io.File;

/**
 *
 * @author Lucas
 */
public interface Gerador {

    public static int SUCESSO = 1;
    public static int ERRO = 0;

    static int gerar(Modelo model, File caminho) {
        return Gerador.ERRO;
    }
}
