package com.Alexander.editorpackage;
/**
*
* @author Alexander Kornetzke
*/
public class EditMethods {
   
   protected void toggleEdit(){
       if(Variables.area.isEditable()){
           Variables.area.setEditable(false);
           Variables.status.setText("This area is No Longer Editable...");
       }
       else if(!Variables.area.isEditable()){
           Variables.area.setEditable(true);
           Variables.status.setText("This area is Now Editable...");
       }
   }
   
}