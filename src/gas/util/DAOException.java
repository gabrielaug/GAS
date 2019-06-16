/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.util;

import javax.swing.JOptionPane;

/**
 *
 * @author gaugusto
 */
public class DAOException extends Exception {
    
    public DAOException(){
        
    }
    
    public DAOException(String x,int y){
        
       
        switch (y){
            case 1:
               JOptionPane.showMessageDialog(null, x,"Erro",JOptionPane.ERROR_MESSAGE);
               break;
            case 2:
                JOptionPane.showMessageDialog(null, x,"Aviso",JOptionPane.WARNING_MESSAGE);
               break;
               case 3:
                JOptionPane.showMessageDialog(null, x,"Informativo",JOptionPane.INFORMATION_MESSAGE);
               break;
        }
                
        
    }
    
}
