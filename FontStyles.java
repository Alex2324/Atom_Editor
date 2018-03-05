package com.Alexander.editorpackage;

import java.awt.Font;
/**
 *
 * @author Alexander Kornetzke
 */
public class FontStyles {
    
    protected void Plain(){
        Variables.fontD = Font.PLAIN;
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Decoration Set to Plain...");
    }    
    protected void Bold(){
        Variables.fontD = Font.BOLD;
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Decoration Set to Bold...");
    }    
    protected void Italic(){
        Variables.fontD = Font.ITALIC;
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Decoration Set to Bold...");
    }    
    protected void BoldItalic(){
        Variables.fontD = Font.BOLD + Font.ITALIC;
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Decoration Set to Bold...");
    }
}
