/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidade.Modelo;
import java.awt.Color;
import javax.swing.text.DefaultHighlighter;

/**
 *
 * @author Lucas
 */
class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {

    Color color;

    public MyHighlightPainter(Color color) {

        super(color);
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
    void setModelo(Modelo modelo){
        //pintar casos de uso
        //this.getHighlighter().addHighlight(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), m2);
        // PINTAR ATOR
        //this.getHighlighter().addHighlight(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), m1);
        // remover highligth
        /*        int begin = jTextPane1.getSelectionStart();
        int end = jTextPane1.getSelectionEnd();
        Highlighter hilite = jTextPane1.getHighlighter();

        Highlighter.Highlight[] hilites = hilite.getHighlights();

        for (int i = 0; i < hilites.length; i++) {

            int e1 = hilites[i].getEndOffset();

            int b1 = hilites[i].getStartOffset();

            if (begin == b1 && end == e1) {

                if (hilites[i].getPainter() instanceof MyHighlightPainter) {

                    hilite.removeHighlight(hilites[i]);
                }
            }
        }*/
    }
}