package com.Alexander.editorpackage;

import java.awt.print.PrinterException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander Kornetzke
 */
public class Print {
    static Frame frame;
    
    protected void Print() {
        try{
            boolean complete = Variables.area.print();
            if (complete) {
                JOptionPane.showMessageDialog(null, "Document printed", " complete"
                        ,JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Canceled...","Printer"
                        ,JOptionPane.ERROR_MESSAGE);
            }            
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
