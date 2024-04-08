import java.util.Scanner;
class Informasi {
 Scanner masukan = new Scanner (System.in);
 Scanner masukan1 = new Scanner (System.in);
 int pilih;
 

    void tampil() {
       System.out.println("==========================");
 System.out.println("         WELLCOME         ");
 System.out.println("            TO            ");
 System.out.println("     vehicle RENTALLER    ");
 System.out.println("==========================");
 
 Kendaraan Informasi = new Kendaraan();
 
 System.out.print ("Masukkan jenis kendaran : ");
 Informasi. jenis = masukan.nextLine();
 
 System.out.print ("Masukkan merek kendaraan : ") ; 
 Informasi. merek = masukan.nextLine();
 
 System.out.print ("Masukkan model kendaraan : ") ;
 Informasi. model = masukan.nextLine();
 
 System.out.print ("Masukkan tahun kendaraan: "); 
 Informasi. tahun = masukan.nextLine();
 
 System.out.println ("============Status=============");
 System.out.println ("1. Tersedia ");
 System.out.println ("2. Disewakan ");
 System.out.print ("Masukkan pilihan [1/2] : ");
 
 String choose = "y";
 int pilihan ;
 do{
    pilihan = masukan1.nextInt();
    if (pilihan == 1){
        Informasi.Status = "Tersedia";
        choose = "y";
    }
    else if (pilihan == 2){
        Informasi.Status = "Disewakn";
        choose = "y";
    }
   }
    while (choose != "y");


 Informasi.Informasi();
 }
}
