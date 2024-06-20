//
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// 
package satuan;
//
///**
// *
// * @author Lenovo
// */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String satuan, satuanAsli, satuanTujuan;
        double nilai;
        boolean ulang=true;
        while(ulang){
            System.out.println("Daftar Satuan :");
            System.out.println("1. suhu");
            System.out.println("2. berat");
            System.out.println("3. panjang");
            System.out.println("4. waktu");
            System.out.print("Pilih Jenis : ");

            satuan=inp.next();
            
            if (satuan.equalsIgnoreCase("suhu")){
                System.out.println("Daftar Satuan Suhu");
                System.out.println("1. Celcius");
                System.out.println("2. Kelvin");
                System.out.println("3. Fahrenh");
               
                System.out.print("Masukan satuan Asal :");
                satuanAsli=inp.next();
                System.out.print("Masukan satuan Tujuan :");
                satuanTujuan=inp.next();
                System.out.print("Masukan Nilai : ");
                nilai=inp.nextDouble();
                convertSuhu suhu1 = new convertSuhu(nilai,satuanAsli, satuanTujuan);
                System.out.println(suhu1.Conversikan());
            }else if (satuan.equalsIgnoreCase("Berat")){
                System.out.println("Daftar Satuan Berat");
                System.out.println("1. Ons");
                System.out.println("2. Gram");
                System.out.println("3. Kilogram");
                System.out.print("Masukan satuan Asal :");
                satuanAsli=inp.next();
                System.out.print("Masukan satuan Tujuan :");
                satuanTujuan=inp.next();
                System.out.print("Masukan Nilai : ");
                nilai=inp.nextDouble();
                convertBerat suhu1 = new convertBerat(nilai,satuanAsli, satuanTujuan);
                System.out.println(suhu1.Conversikan());
            }else if (satuan.equalsIgnoreCase("Panjang")){
                System.out.println("Daftar Satuan Panjang");
                System.out.println("1. Centimeter");
                System.out.println("2. Meter");
                System.out.println("3. Kilometer");
                System.out.print("Masukan satuan Asal :");
                satuanAsli=inp.next();
                System.out.print("Masukan satuan Tujuan :");
                satuanTujuan=inp.next();
                System.out.print("Masukan Nilai : ");
                nilai=inp.nextDouble();
                convertPanjang suhu1 = new convertPanjang(nilai,satuanAsli, satuanTujuan);
                System.out.println(suhu1.Conversikan());
            }else if (satuan.equalsIgnoreCase("Waktu")){
                System.out.println("Daftar Satuan Waktu");
                System.out.println("1. Detik");
                System.out.println("2. Menit");
                System.out.println("3. Jam");
                System.out.print("Masukan satuan Asal :");
                satuanAsli=inp.next();
                System.out.print("Masukan satuan Tujuan :");
                satuanTujuan=inp.next();
                System.out.print("Masukan Nilai : ");
                nilai=inp.nextDouble();
                convertWaktu suhu1 = new convertWaktu(nilai,satuanAsli, satuanTujuan);
                System.out.println(suhu1.Conversikan());
            }else{
                System.out.println("pilihan tidak tersedia silahkan pilih lagi");
            }
            
            System.out.print("Ulangi? : ");
            String ulangi=inp.next();
            if(ulangi.equalsIgnoreCase("y")){
                ulang=true;
            }else{
                ulang=false;
            }
            
        }
             
    }
}