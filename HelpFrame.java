package com.Alexander.editorpackage;

import java.awt.BorderLayout; 
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 *
 * @author Alexander Kornetzke
 */
public class HelpFrame extends JFrame{
    public JTextArea helpArea;
       
        public HelpFrame(){
                setTitle("Help");
               
                helpArea = new JTextArea("Help pane for later use");
               
                helpArea.setLineWrap(true);
                helpArea.setWrapStyleWord(true);
                helpArea.setEditable(false);
                add(helpArea, BorderLayout.CENTER);
        }
}
