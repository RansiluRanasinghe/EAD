/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassFiles;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dinis
 */
public class Payments {
    
    public static boolean doPayment(int ranVal, double subtot){
        
        if (ranVal > subtot) {
            return true;
        }
        if (ranVal == subtot) {
            JFrame f = new JFrame();
            if (JOptionPane.showConfirmDialog(f, "Your account balance will be zero after this \n Do you wish to continue?") == JOptionPane.YES_NO_OPTION) {
                return true;
            } else {
                return false;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Your account balance is low ("+ranVal+")" );
        return false;
           
    }
}
