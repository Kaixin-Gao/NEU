/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Verify;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author zhang
 */
public class DoubleVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                double number=Double.parseDouble(text);
                if(number<0)
                {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Number cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                input.setBackground(Color.white);
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid decimal value", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.red);
            return false;
        }
    }
}

