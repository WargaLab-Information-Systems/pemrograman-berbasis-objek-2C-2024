/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author ASUS
 */
public class Manusia {
    public Manusia(){
        //konstruktor mendefinisikan
        System.out.println("nama :marsha");
        System.out.println("umur :20 tahun");
        System.out.println("alamat :bojonegoro");
    }

    /**
     * @param args the command line arguments
     */
 
public static void marsha () {
    System.out.println("nama saya marsha");
}
  public static void berjalan () {
      System.out.println("sedang berjalan");
  }
  
  public static void berlari() {
      System.out.println("sedang berlari");
  }
  
  public static void main(String[] args) {
      //didalam method kita bisa membuat objek baru(obj)dengan mendeklarasikan class
      //manusia
     Manusia obj = new Manusia ();
     //memanggil fungsi 
     obj.berjalan();
     obj.berlari();
     obj.marsha();
  
  
  

   }
    
}
