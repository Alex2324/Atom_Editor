package com.Alexander.editorpackage;

import java.awt.Font;
/**
 *
 * @author Alexander Kornetzke
 */
public class FontTypes {
    protected void Arial(){
        Variables.fontF = "Arial";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Arial");
    }
    protected void ArialBlack(){
        Variables.fontF = "Arial Black";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Arial Black");
    }
    protected void ArialHebrew(){
        Variables.fontF = "Arial Hebrew";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Arial Hebrew");
    }
    protected void ArialNarrow(){
        Variables.fontF = "Arial Narrow";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Arial Narrow");
    }
    protected void ArialRoundedMTBold(){
        Variables.fontF = "Arial Rounded MT Bold";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Arial Rounded MT Bold");
    }
    protected void ComicSansMS(){
        Variables.fontF = "ComicSansMS";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: ComicSansMS");
    }
    protected void Consolas(){
        Variables.fontF = "Consolas";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Consolas"); 
    }
    protected void Courier(){
        Variables.fontF = "Courier";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Courier"); 
    }
    protected void Helvetica(){
        Variables.fontF = "Helvetica";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Helvetica");
    }
    protected void Monospaced(){
        Variables.fontF = "Monospaced";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Monospaced");
    }
    protected void SansSerif(){
        Variables.fontF = "SansSerif";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: SansSerif");
    }
    protected void Serif(){
        Variables.fontF = "Serif";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Serif");
    }   
    protected void TimesNewRoman(){
        Variables.fontF = "Times New Roman";
        Variables.area.setFont(new Font(Variables.fontF, Variables.fontD, Variables.fontS));
        Variables.status.setText("Font Changed to: Times New Roman");
    }
}