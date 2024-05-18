/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

public class manusia {

    String nama;
    int umur;
    String alamat;
    
    public String berjalan(){
        return(nama + "sedang berjalan");
}
    public String berlari(){
        return (nama + "akan berlari berjalan");
    }
    public static void main(String[] args) {
    manusia Manusia1=new manusia();
    manusia Manusia2=new manusia();
     
    Manusia1.nama="dzaki";
    Manusia1.umur=18;
    Manusia1.alamat="Surabaya";
    Manusia1.berjalan();
    Manusia1.berlari();
    
    Manusia2.nama="abdi";
    Manusia2.umur=18;
    Manusia2.alamat="nganjuk";
    Manusia2.berjalan();
    Manusia2.berlari();
       
    System.out.println("Nama "+Manusia1.nama);
    System.out.println("Umur "+Manusia1.umur);
    System.out.println("Tinggal di "+Manusia1.alamat);
    System.out.println("Nama "+Manusia2.nama);
    System.out.println("Umur "+Manusia2.umur);
    System.out.println("Tinggal di "+Manusia2.alamat);
    System.out.println(Manusia1.nama + " sedang berjalan " );
    System.out.println(Manusia1.nama + " akan berlari " );
    System.out.println(Manusia2.nama + " sedang berjalan " );
    System.out.println(Manusia2.nama + " akan berlari " );
    
      
        
    }
    
}

