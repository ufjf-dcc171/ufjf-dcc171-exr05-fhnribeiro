/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr5;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 11944413600
 */
public class JanelaImposto extends JFrame{
    private final JLabel lblValor = new JLabel("Valor(USD)");
    private final JTextField valor = new JTextField(25);
    private final JLabel lblCotacao = new JLabel("Cotação do dolar");
    private final JTextField cotacao = new JTextField(25);
    private final JCheckBox tributado = new JCheckBox("Tributável");
    private final JCheckBox icms = new JCheckBox("ICMS");
    private final JButton button = new JButton("Calcular");
    private final JLabel result = new JLabel("Total:");
    public JanelaImposto() throws HeadlessException{
       super("Calculo impostos");
       setLayout(new FlowLayout(FlowLayout.LEFT));
       add(lblValor);
       add(valor);
       add(lblCotacao);
       add(cotacao);
       add(tributado);
       add(icms);
       add(button);
       add(result);
       button.addActionListener(new calculaImposto());
    }

    private class calculaImposto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double valorDolar=0.0,valorProd=0.0;
            try {
                valorProd = Double.parseDouble(valor.getText());
            } catch (NumberFormatException ev) {
                System.out.println(ev);
                JOptionPane.showMessageDialog(null,"Valor do Valor(USD) invalido","Error",2);
            }
            try {
                valorDolar = Double.parseDouble(cotacao.getText());
            } catch (NumberFormatException ev) {
                JOptionPane.showMessageDialog(null,"Valor da cotacao invalido","Error",2);
            }
            
            
            Double total = valorDolar*valorProd;
            
            if(tributado.isSelected()){
                total=total+(total*0.6);
                if(icms.isSelected()){
                    total=total+(total*0.18);
                }
            }
            
            
            
            result.setText("Total: "+total);
            
        }
        
    }
    
    
}
