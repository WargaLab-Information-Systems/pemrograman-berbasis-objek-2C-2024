/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;
import java.util.Scanner; 
public class penyewaan {
        public static void main(String[] args) {
        Scanner kdr = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah data kendaraan yang ingin dimasukkan : ");
        int jumlahdata = kdr.nextInt();
        kdr.nextLine();
        
        Kendaraan[] KendaraanArray = new Kendaraan[jumlahdata];
        
        for (int i = 0 ; i < jumlahdata; i++){
            System.out.println("masukkan jenis kendaraan");
            String jnskdr = kdr.next();
            System.out.println("masukkan merek");
            String merek = kdr.next();
            System.out.println("masukkan model");
            String model = kdr.next();
            System.out.println("status (T/D)");
            char status = kdr.next().charAt(0);           
            System.out.println("masukkan tahun" );
            String tahun = kdr.next();
            System.out.println("");
            
            if (jnskdr.equalsIgnoreCase("mobil")){
                KendaraanArray[i]=new mobil(merek,model,status,tahun);   
            }else if (jnskdr.equalsIgnoreCase("motor")){
                KendaraanArray[i]=new motor(merek,model,status,tahun);   
            }else if (jnskdr.equalsIgnoreCase("sepeda")){
                KendaraanArray[i]=new motor(merek,model,status,tahun);    
          }
        }
        for (Kendaraan kendaraan : KendaraanArray){
            kendaraan.display();
            System.out.println("");
        }
           
    }           
}

    

