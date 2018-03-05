package com.Alexander.editorpackage;

//import java libraries
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.io.File;
/**
*
* @author Alexander Kornetzke
*/
public class Frame extends JFrame {
//declare about and help frame for eventual instantiation
      
  public AboutFrame aboutF;
  public HelpFrame helpF;
  public FileMethods fMethods = new FileMethods();
  public EditMethods eMethods = new EditMethods();    
  public FontTypes fTypes = new FontTypes();
  public FontStyles fStyles = new FontStyles();
  public FontSizes fSizes = new FontSizes();
  public Print printArea = new Print();
      
  public Frame() {
      // set flow layout for the frame


      //instantiate frame menu objects                         
      Variables.menu = new JMenuBar();
      //displays menu bar in default position
      setJMenuBar(Variables.menu);
              
      Variables.area = new JTextArea();
      Variables.status = new JLabel("Welcome the Atom Text Editor!");
      Variables.toolBar = new JToolBar("My Toolbar");
      Variables.toolBar.setFloatable(false);
                              
      //instantiate original text to be displayed when a new frame object is created
      Font originalFont = new Font(Variables.fontF, 
                      Variables.fontD, Variables.fontS);
              
      Variables.area.setFont(originalFont);
      
      //  create a line border with the specified color and width
      Border border = BorderFactory.createMatteBorder(50, 575, 10, 575, Color.LIGHT_GRAY);

      // set the border of this component
      //Variables.area.setBorder(border);
      Variables.area.setBorder(BorderFactory.createCompoundBorder(border, 
          BorderFactory.createEmptyBorder(75, 75, 75, 75)));
         
      //instantiate menu tab objects and their respectively displayed string names 
      Variables.file = new JMenu("File");
      Variables.edit = new JMenu("Edit");              
      Variables.help = new JMenu("Help");
              
      //instantiate file menu tab objects and their respective string names 
      Variables.New = new JMenuItem("New");
      Variables.Open = new JMenuItem("Open");
      Variables.Save = new JMenuItem("Save");
      Variables.SaveAs = new JMenuItem("Save As");
      Variables.Exit = new JMenuItem("Exit");
              
      //use add() method to add elements to the file list 
      Variables.file.add(Variables.New);
      Variables.file.add(Variables.Open);
      Variables.file.add(Variables.Save);
      Variables.file.add(Variables.SaveAs);
      Variables.file.add(Variables.Exit);
              
      //instantiate toggle editable object and its respective string name 
      Variables.undo = new JMenuItem("Undo");
      Variables.redu = new JMenuItem("Redu");
      Variables.ToggleEdit = new JMenuItem("Toggle Editable");
      Variables.cut = new JMenuItem("Cut");
      Variables.copy = new JMenuItem("Copy");
      Variables.paste = new JMenuItem("Paste");
      Variables.delete = new JMenuItem("Delete");
              
      //use add() method to add elements to the edit list 
      Variables.edit.add(Variables.undo);
      Variables.edit.add(Variables.redu);
      Variables.edit.add(Variables.ToggleEdit);
      Variables.edit.add(Variables.cut);
      Variables.edit.add(Variables.copy);
      Variables.edit.add(Variables.paste);
      Variables.edit.add(Variables.delete);                                                   
     
      //create print button then add it to the toolbar
      Variables.print = new JButton("Print");
      Variables.toolBar.add(Variables.print);
      Variables.toolBar.addSeparator();
      Variables.print.setText(null); 
      Variables.print.setIcon(new ImageIcon("images/printer.png"));
      Variables.print.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      
      Variables.fontArray = new String[0];
      JComboBox<String> fontList = new JComboBox<>(Variables.fontArray);
              
      //fill fontList ComboBox 
      fontList.addItem("<html><body style=\"font-family: " + "Arial" + "\"<b>Arial</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Arial Black" + "\"<b>Arial Black</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Arial Hebrew" + "\"<b>Arial Hebrew</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Arial Narrow" + "\"<b>Arial Narrow</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Arial Rounded MT Bold" + "\"<b>Arial Rounded MT Bold</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "ComicSansMS" + "\"<b>ComicSansMS</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Consolas" + "\"<b>Consolas</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Courier" + "\"<b>Courier</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Helvetica" + "\"<b>Helvetica</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Monospaced" + "\"<b>Monospaced</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "SansSerif" + "\"<b>SansSerif</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Serif" + "\"<b>Serif</b></html>");
      fontList.addItem("<html><body style=\"font-family: " + "Times New Roman" + "\"<b>Times New Roman</b></html>");
      
      //create font button then add it to the toolbar        
      fontList.setMaximumSize(fontList.getPreferredSize());
      Variables.toolBar.add(fontList);
      Variables.toolBar.addSeparator();
              
      //set size of combox so that it is only as wide as necessary
      Variables.fontSArray = new String[0];
      JComboBox<String> fontSizeList = new JComboBox<>(Variables.fontSArray);
              
      //fill fontSizeList
      fontSizeList.addItem("8");fontSizeList.addItem("9");fontSizeList.addItem("10");
      fontSizeList.addItem("11");fontSizeList.addItem("12");fontSizeList.addItem("13");
      fontSizeList.addItem("14");fontSizeList.addItem("15");fontSizeList.addItem("16");
      fontSizeList.addItem("17");fontSizeList.addItem("18");fontSizeList.addItem("19");
      fontSizeList.addItem("20");fontSizeList.addItem("22");fontSizeList.addItem("24");
      fontSizeList.addItem("26");fontSizeList.addItem("28");fontSizeList.addItem("30");
      fontSizeList.addItem("32");fontSizeList.addItem("34");fontSizeList.addItem("36");
      fontSizeList.addItem("38");fontSizeList.addItem("40");fontSizeList.addItem("44");
      fontSizeList.addItem("48");fontSizeList.addItem("52");fontSizeList.addItem("56");
      fontSizeList.addItem("60");fontSizeList.addItem("64");fontSizeList.addItem("68");
      fontSizeList.addItem("72");
              
      //set size of combox so that it is only as wide as necessary
      fontSizeList.setMaximumSize( fontSizeList.getPreferredSize() );
      Variables.toolBar.add(fontSizeList);     
              
      //create font style buttons and add them to the toolbar
      Variables.fontPlain = new JButton("Plain");
      Variables.toolBar.add(Variables.fontPlain);
      Variables.fontPlain.setText(null); 
      Variables.fontPlain.setIcon(new ImageIcon("/Atom Editor/Atom Editor/images/plain.png"));
      Variables.fontPlain.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      Variables.toolBar.addSeparator();
      
      Variables.fontBold = new JButton("Bold");
      Variables.toolBar.add(Variables.fontBold);
      Variables.fontBold.setText(null); 
      Variables.fontBold.setIcon(new ImageIcon("/Atom Editor/Atom Editor/images/bold.png"));
      Variables.fontBold.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      Variables.toolBar.addSeparator();
      
      Variables.fontItalic = new JButton("Italic");
      Variables.toolBar.add(Variables.fontItalic);
      Variables.fontItalic.setText(null); 
      Variables.fontItalic.setIcon(new ImageIcon("/Atom Editor/Atom Editor/images/italic.png"));
      Variables.fontItalic.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      Variables.toolBar.addSeparator();
      
      Variables.fontBoldItalic = new JButton("Bold Italic");
      Variables.toolBar.add(Variables.fontBoldItalic);
      Variables.fontBoldItalic.setText(null); 
      Variables.fontBoldItalic.setIcon(new ImageIcon("/Atom Editor/Atom Editor/images/Bold-Italic.png"));
      Variables.fontBoldItalic.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
      Variables.toolBar.addSeparator();
      
      //create font color button then add it to the toolbar    
      JButton colorFont = new JButton("Font Color");
      Variables.toolBar.add(colorFont);
      Variables.toolBar.addSeparator();
              
      //instantiate about and help menu item and their respective string names 
      Variables.hAbout = new JMenuItem("About...");
      Variables.hHelp = new JMenuItem("Help...");
              
      //use add() method to add elements to the help list 
      Variables.help.add(Variables.hAbout);
      Variables.help.add(Variables.hHelp);
              
      //use add() method to add all menu items into the menu list 
      Variables.menu.add(Variables.file);
      Variables.menu.add(Variables.edit);
      Variables.menu.add(Variables.help);
           
      //use add() method to display the menu list to the top of the frame
      add(Variables.toolBar, BorderLayout.NORTH);
                                              
      //uss add() method to display the toolBar list  
      Variables.toolBar.add(fontSizeList);
              
      /*setLineWrap Sets whether lines are wrapped if they are too long to fit within the 
      allocated width. By default this property is false and lines are not wrapped.
      setWrapStyleWord sets whether lines can be wrapped at white space 
      (word boundaries) or at any character. By default this property is false, 
      and lines can be wrapped(if line wrapping is turned on) at any character.*/ 
      Variables.area.setLineWrap(true);
      Variables.area.setWrapStyleWord(false);//leave false to allow space and tab keys towork properly
      Variables.area.setSelectionColor(Color.BLACK);
      Variables.area.setSelectedTextColor(Color.WHITE);
              
      //instantiate the scrollbar object                
      Variables.scrollBar = new JScrollPane(Variables.area);
              
      //use add() method to display the scrollbar                
      add(Variables.scrollBar, BorderLayout.CENTER);

      Variables.area.setPreferredSize(new Dimension(600, 0));;     
      
      //use add() method to the status object               
      add(Variables.status, BorderLayout.SOUTH);
              
      //create actionListeners for the file menu                
      Variables.New.addActionListener((ActionEvent e) -> {
          fMethods.New();});
      Variables.Open.addActionListener((ActionEvent e) -> {
          fMethods.Open();});               
      Variables.Save.addActionListener((ActionEvent e) -> {
          fMethods.Save();});
      Variables.SaveAs.addActionListener((ActionEvent e) -> {
          fMethods.SaveAs();});              
      Variables.Exit.addActionListener((ActionEvent e) -> {
          fMethods.Exit();});                
                              
      //create actionListeners for the edit menu
      Variables.undo.addActionListener((ActionEvent e) -> {
      });
      Variables.redu.addActionListener((ActionEvent e) -> {
      });
      Variables.ToggleEdit.addActionListener((ActionEvent e) -> {
          eMethods.toggleEdit();});                
      Variables.cut.addActionListener((ActionEvent e) -> {
          Variables.area.cut();});                
      Variables.copy.addActionListener((ActionEvent e) -> {
          Variables.area.copy();});
      Variables.paste.addActionListener((ActionEvent e) -> {
          Variables.area.paste();});
      Variables.delete.addActionListener((ActionEvent e) -> {
      });
      
      Variables.print.addActionListener((ActionEvent e) -> {
          printArea.Print();
      });
      
      fontList.addActionListener((ActionEvent e) -> {
                  
          JComboBox c = (JComboBox)e.getSource();
          String f = (String)c.getSelectedItem();
                      
              switch(f){
                  case "Arial": fTypes.Arial();
                      break;
                  case "Arial Black": fTypes.ArialBlack();
                      break;
                  case "Arial Hebrew": fTypes.ArialHebrew();
                      break;
                  case "Arial Narrow": fTypes.ArialNarrow();
                      break;
                  case "Arial Rounded MT Bold": fTypes.ArialRoundedMTBold();
                      break;
                  case "ComicSansMS": fTypes.ComicSansMS();
                      break;
                  case "Consolas": fTypes.Consolas();
                      break;
                  case "Courier": fTypes.Courier();
                      break;
                  case "Helvetica": fTypes.Helvetica();
                      break;
                  case "Monospaced": fTypes.Monospaced();
                      break;
                  case "SansSerif": fTypes.SansSerif();
                      break;
                  case "Serif": fTypes.Serif();
                      break;
                  case "Times New Roman": fTypes.TimesNewRoman();                                                       
              }                            
      });
              
      //create action listener for font size combo box
      fontSizeList.addActionListener((ActionEvent e) -> {
                  
              JComboBox c = (JComboBox)e.getSource();
              String size = (String)c.getSelectedItem();
                      
              switch(size){
                  case "8": fSizes.Eight();
                      break;
                  case "9": fSizes.Nine();
                      break;
                  case "10": fSizes.Ten();
                      break;
                  case "11": fSizes.Eleven();
                      break;
                  case "12": fSizes.Twelve();
                      break;
                  case "13": fSizes.Thirteen();
                      break;
                  case "14": fSizes.Fourteen();
                      break;
                  case "15": fSizes.Fifteen();
                      break;
                  case "16": fSizes.Sixteen();
                      break;
                  case "17": fSizes.Seventeen();
                      break;
                  case "18": fSizes.Eighteen();
                      break;
                  case "19": fSizes.Nineteen();
                      break;
                  case "20": fSizes.Twenty();
                      break;
                  case "22": fSizes.TwentyTwo();
                      break;
                  case "24": fSizes.TwentyFour();
                      break;
                  case "26": fSizes.TwentySix();
                      break;
                  case "28": fSizes.TwentyEight();
                      break;
                  case "30": fSizes.Thirty();
                      break;
                  case "32": fSizes.ThirtyTwo();
                      break;
                  case "34": fSizes.ThirtyFour();
                      break;
                  case "36": fSizes.ThirtySix();
                      break;
                  case "38": fSizes.ThirtyEight();
                      break;
                  case "40": fSizes.Fourty();
                      break;
                  case "44": fSizes.FourtyFour();
                      break;
                  case "48": fSizes.FourtyEight();
                      break;
                  case "52": fSizes.FiftyTwo();
                      break;
                  case "56": fSizes.FiftySix();
                      break;
                  case "60": fSizes.Sixty();
                      break;
                  case "64": fSizes.SixtyFour();
                      break;
                  case "68": fSizes.SixtyEight();
                      break;
                  case "72": fSizes.SeventyTwo();                            
              }                            
      });

      //create action listener for font style combo box
      Variables.fontPlain.addActionListener((ActionEvent e) -> {
                  fStyles.Plain();
      });
      Variables.fontBold.addActionListener((ActionEvent e) -> {
                  fStyles.Bold();
      });
      Variables.fontItalic.addActionListener((ActionEvent e) -> {
                  fStyles.Italic();
      });
      Variables.fontBoldItalic.addActionListener((ActionEvent e) -> {
                  fStyles.BoldItalic();
      });
      //create action listener for the font color chooser
      colorFont.addActionListener((ActionEvent e) -> {
          Color initialcolor=Color.BLACK;  
          Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);  
          Variables.area.setForeground(color);
      });
              
      Variables.hAbout.addActionListener((ActionEvent e) -> {
          aboutF = new AboutFrame();
                  
          aboutF.setSize(600, 400);
          aboutF.setVisible(true);
          aboutF.setResizable(false);
          aboutF.setLocationRelativeTo(null);
      });
             
      Variables.hHelp.addActionListener((ActionEvent e) -> {
          helpF = new HelpFrame();
                  
          helpF.setSize(600, 400);
          helpF.setVisible(true);
          helpF.setResizable(false);
          helpF.setLocationRelativeTo(null);
      });                                
  }                             
}
