package com.Alexander.editorpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Alexander Kornetzke
 */
public class FileMethods {
    
    static Frame frame;
    
    protected void openFile(File file) {
        
        if (file.canRead()) {
            String filePath = file.getPath();
            String fileContents = "";
            String fileName = file.getName();
            
            if (filePath.endsWith(".txt")) {
                
                try (Scanner scan = new Scanner(new FileInputStream(file))) {
                    while (scan.hasNextLine()) {
                        fileContents += scan.nextLine();
                    }
                } 
                catch (FileNotFoundException e) {} 
                Variables.area.setText(fileContents);
                Variables.currentFile = file;
            } 
            else JOptionPane.showMessageDialog(null,"That file type is not supported!\nOnly .txt files are supported.");

        } 
            else JOptionPane.showMessageDialog(null, "Could not open file");
    }
        
        protected void saveFile(File file, String contents){
        
                BufferedWriter writer;
                String filePath = file.getPath();
                
                if(!filePath.endsWith(".txt")){
                        filePath += ".txt";
                }             
                try{
                    writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write(contents);
                    writer.close();
                    Variables.area.setText(contents);
                    frame.setTitle("Text Editor v.1.0" + filePath);
                    Variables.currentFile = file;
                } 
                catch(Exception e) {                       
                }
        }
        
        protected void New(){
            if (JOptionPane.showConfirmDialog(null,
                            "Are you sure you want to create a new file?") == 0) {
                        Variables.area.setText("");
                        Variables.status.setText("Generated New File...");        
                    }
        }
        
        protected void Open(){
            if (JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to trash the current file?") == 0) {
            
                int openResult = Variables.fileSelect.showOpenDialog(null);

                if (openResult == JFileChooser.APPROVE_OPTION) {
                    openFile(Variables.fileSelect.getSelectedFile());
                    Variables.status.setText("Opened File...");
                }        
            }
        }
        
        protected void Save(){
            if(Variables.currentFile == null){
                int saveResult = Variables.fileSelect.showSaveDialog(null);
                        
                if(saveResult == JFileChooser.APPROVE_OPTION){
                    saveFile(Variables.fileSelect.getSelectedFile(), Variables.area.getText());
                }
            }
            else {
                saveFile(Variables.currentFile, Variables.area.getText());
            }
            Variables.status.setText("File Saved...");
        }
        
        protected void SaveAs(){
            int saveResult = Variables.fileSelect.showSaveDialog(null);
                saveFile(Variables.fileSelect.getSelectedFile(), Variables.area.getText());
                Variables.status.setText("File Saved...");
        }
        
        protected void Exit(){
            if(JOptionPane.showConfirmDialog(null, "Are you sure you want"
                            + "to exit without saving your document")==0){
                System.exit(0);
            }
        }
}