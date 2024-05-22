/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

import java.util.Scanner;

public class main {
//    String nama="adzka";
//    int umur=18;
//    
//    static void saya(String nama,int umur){
//        System.out.println("nama saya:"+nama);
//        System.out.println("umur saya:"+umur);
//    }
//       
    public static void main(String[] args) throws Exception {
//        saya("fghj",18);
//        System.exit(0);
        Scanner Input =new Scanner(System.in);
        Mobil mbl=null;
        
        
         while(true){
            System.out.println("1.MPV");
            System.out.println("2.SUV");
            System.out.println("3.MobilSport");
            System.out.println("4.MobilListrik");
            System.out.println("5.keluar");
            System.out.print("Silahkan Pilih opsi 1-5 :");
            int pilihan = Input.nextInt();
            Input.nextLine(); // Konsumsi newline setelah input integer
            
          if (pilihan == 1){
            System.out.print("Masukkan Merk:");
            String merk=Input.nextLine();   
            System.out.print("masukkan Model:");
            String model=Input.nextLine(); 
            System.out.print("Tahun keluaran:");
            int tahun=Input.nextInt(); 
            mbl= new MPV(merk,model,tahun);
            mbl.showfeature(" - 180 km/h");
            
            } else if (pilihan == 2){
            System.out.print("Masukkan Merk:");
            String merk=Input.nextLine();   
            System.out.print("masukkan Model:");
            String model=Input.nextLine(); 
            System.out.print("Tahun keluaran:");
            int tahun=Input.nextInt(); 
            mbl= new SUV(merk,model,tahun);   
            mbl.showfeature(" merah");
            
            } else if (pilihan == 3){
            System.out.print("Masukkan Merk:");
            String merk=Input.nextLine();   
            System.out.print("masukkan Model:");
            String model=Input.nextLine(); 
            System.out.print("Tahun keluaran:");
            int tahun=Input.nextInt(); 
            mbl= new MobilSport(merk,model,tahun);  
            mbl.showfeature("kuning",2);
            
            } else if (pilihan == 4){
             System.out.print("Masukkan Merk:");
            String merk=Input.nextLine();   
            System.out.print("masukkan Model:");
            String model=Input.nextLine(); 
            System.out.print("Tahun keluaran:");
            int tahun=Input.nextInt(); 
            mbl= new MobilListrik(merk,model,tahun); 
            mbl.showfeature("2M");
            } else if (pilihan == 5){
                 System.out.println(" Anda keluar! Terimakasih");
                 System.exit(0);
            } else{
                System.out.println("Pilihan Tidak Tersedia");
                    continue;
            }
           
           if (mbl!=null){
               mbl.showfeature();
           }
        }
    }
}
