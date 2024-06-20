/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gadget;
   
    

abstract class Gadget implements kamera,bluethooth,wifi,gps{
     String Merk;
     String Model;
   
     Gadget(String Merk,String Model){
         this.Merk=Merk;
         this.Model=Model;
     }
    void gadget() {
  
    }
 }