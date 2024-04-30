/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfersi;
import java.util.Scanner;
public class main {
public static void main(String[] args) {
        // Contoh penggunaan konversi 
    Scanner unitname = new Scanner (System.in);
    boolean isRunn = true;
    
//    pengulangan 
    while (isRunn){
        System.out.println("masukkan nilai :");
        double value = unitname.nextDouble();
        unitname.nextLine();
        
        System.out.println("masukkan satuan asal dari suhu,berat,waktu, dan panjang (misal :celcius, meter,gram,detik) :");
        String KonfersiAwal = unitname.nextLine();
        
        
        Konfersi konfersi ;
//        konfersi satuan celcius ke fahrenheit
        if (KonfersiAwal.equalsIgnoreCase("celcius")) {
            konfersi = new suhu(KonfersiAwal); 
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" fahrenheit");
        
//        konfersi satuan  fahrenheit ke reamur
        } else if (KonfersiAwal.equalsIgnoreCase("fahrenheit")){
            konfersi = new suhu(KonfersiAwal);
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" reamur");
            
//        konfersi satuan reamur ke kelvin           
        } else if (KonfersiAwal.equalsIgnoreCase("reamur")){
            konfersi = new suhu(KonfersiAwal);
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" kelvin");

//        konfersi satuan celcius ke reamur           
        } else if (KonfersiAwal.equalsIgnoreCase("celciusToReamur")){
            konfersi = new suhu(KonfersiAwal);
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" reamur");
            
//        konfersi satuan centimeter ke meter            
        } else if (KonfersiAwal.equalsIgnoreCase("centimeter")){
            konfersi = new panjang(KonfersiAwal);
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" meter");

//        konfersi satuan meter ke kilometer           
        } else if (KonfersiAwal.equalsIgnoreCase("meter")){
            konfersi = new panjang(KonfersiAwal);
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" kilometer");  

//        konfersi satuan gram ke kilogram            
        } else if (KonfersiAwal.equalsIgnoreCase("gram")){
            konfersi = new berat(KonfersiAwal); 
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" kilogram");

//        konfersi satuan kilogram ke ton            
        } else if (KonfersiAwal.equalsIgnoreCase("kilogram")){
            konfersi = new berat(KonfersiAwal); 
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" ton");     

//        konfersi satuan detik ke menit            
        } else if (KonfersiAwal.equalsIgnoreCase("detik")){
            konfersi = new waktu(KonfersiAwal); 
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" menit");

//        konfersi satuan menit ke jam            
        } else if (KonfersiAwal.equalsIgnoreCase("menit")){
            konfersi = new waktu(KonfersiAwal); 
            double convertvalue = konfersi.convert(value);
            System.out.println("nilai setelah dikonfersi: "+convertvalue +" jam");
            
        } else {
            System.out.println("satuan tidak valid");
            return;
        }    

        System.out.println("apakah anda masih ingin mengkonfersi nilai? (y/t)");
        String continueInput = unitname.nextLine();
        if (!continueInput.equalsIgnoreCase("y")){
//            menghentikan pengulangan
            isRunn = false; 
            System.out.println("terima kasih");
        }
    }

     unitname.close();
    } 
}

