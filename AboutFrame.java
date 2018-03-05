package com.Alexander.editorpackage;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 *
 * @author Alexander Kornetzke
 */
public class AboutFrame extends JFrame{
    public JTextArea exp;
       
        public AboutFrame(){
                setTitle("About Text Editor v.1.0");
               
                exp = new JTextArea("This is my test Text Editor written in Java");
                exp.setLineWrap(true);
                exp.setWrapStyleWord(true);
                exp.setEditable(false);
                add(exp, BorderLayout.CENTER);
        }
}
