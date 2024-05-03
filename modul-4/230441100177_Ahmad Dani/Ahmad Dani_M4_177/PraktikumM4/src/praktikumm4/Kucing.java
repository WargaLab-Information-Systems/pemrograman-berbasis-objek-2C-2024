/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm4;

/**
 *
 * @author User
 */
public class Kucing extends Hewan {
       public Kucing(String nama) {
           this.nama = nama;
       }
       
       @Override
       public void bersuara() {
           System.out.println("Meow");
       }
       
       @Override
       public void makan() {
           System.out.println("Makan");
       }
}
