package com.Alexander.editorpackage;

//import java libraries
import java.awt.Font;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JButton;
/**
*
* @author Alexander Kornetzke
*/
public class Variables extends JFrame{
  
//declare menu object 
      static JMenuBar menu;
      static JToolBar toolBar;
      
//declare menu items 
      static JMenu file;
      static JMenu edit;
      static JMenu help;
      
//declare file sub menu 
      static JMenuItem New;
      static JMenuItem Open;
      static JMenuItem Save;
      static JMenuItem SaveAs;
      static JMenuItem Exit;
      
//declare edit sub menu 
      static JMenuItem undo;
      static JMenuItem redu;
      static JMenuItem ToggleEdit; 
      static JMenuItem cut;
      static JMenuItem copy;
      static JMenuItem paste;
      static JMenuItem delete;
      
//declare font array
      static JLabel fontArrayLabel;
      static String[] fontSArray; 
      
//declare font styles
      static JButton fontPlain;
      static JButton fontBold;
      static JButton fontItalic;
      static JButton fontBoldItalic;
//declare font array        
      static String[] fontArray;
      
//declare color Chooser
      static JButton fontColor;
              
//declare help menu sub items 
      static JMenuItem hAbout;
      static JMenuItem hHelp;
      
//declare writable text area 
      static JTextArea area;
      
//declare scrollbar 
      static JScrollPane scrollBar;
      
//declare status text 
      static JLabel status;

//declare print button
      static JButton print;
      
//declare original font type 
      static String fontF = "Arial";
      static int fontD = Font.PLAIN;
      static int fontS = 8; 
      static Font originalFont;
      
//declare file selection tool 
      static JFileChooser fileSelect = new JFileChooser();
      
//declare the current file 
      static File currentFile;
              
//declare about and help frame for eventual instantiation       
      static AboutFrame aboutF;
      static HelpFrame helpF;
}

