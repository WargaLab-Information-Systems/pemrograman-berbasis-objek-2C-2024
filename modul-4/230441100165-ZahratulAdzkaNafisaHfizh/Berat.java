/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert_aplication;

/**
 *
 * @author HP
 */
public class Berat extends Convert_aplication {
    @Override
    public int Hasil(double angka) {
        int hasil = 0;
        
        double gram = 1000 * angka; // deklarasi variabel gram dan hitung gram = 1000 * angka
        double pon = 2 * angka; // deklarasi variabel pon dan hitung pon = 2 * angka
        double ons = pon * 5; // deklarasi variabel ons dan hitung ons = pon * 5

        // cetak hasil ke layar
        
        System.out.println("\n" + angka + " angka " + "sama dengan = " + pon + " pon atau " + ons + " ons atau " + gram + " gram");
        
        // Mengembalikan hasil untuk kemungkinan penggunaan di kelas lain
        return hasil;
    }
}
