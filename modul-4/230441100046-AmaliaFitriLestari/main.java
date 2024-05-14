/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfersi;
public class main {
public static void main(String[] args) {
        // Contoh penggunaan konversi suhu
        suhu celsius = new suhu("Celsius");
        System.out.println("30 derajat Celsius setara dengan " + celsius.convert(30) + " Fahrenheit");

        // Contoh penggunaan konversi panjang
        panjang meter = new panjang("Meter");
        System.out.println("5000 meter setara dengan " + meter.convert(5000) + " Kilometer");

        // Contoh penggunaan konversi berat
        berat gram = new berat("Gram");
        System.out.println("3000 gram setara dengan " + gram.convert(3000) + " Kilogram");

        // Contoh penggunaan konversi waktu
        waktu detik = new waktu("Detik");
        System.out.println("3600 detik setara dengan " + detik.convert(3600) + " Menit");
    }
}

