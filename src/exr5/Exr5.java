/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr5;

import javax.swing.JFrame;

/**
 *
 * @author 11944413600
 */
public class Exr5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JanelaImposto janela = new JanelaImposto();
        janela.setSize(300,300);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
