/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penyewaan;

public class Mobil extends Kendaraan {
    public Mobil (String merek, String model, char status, int tahun) {
            super("Mobil", merek, model, status, tahun);
    }
     
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo dari kelas induk
        System.out.println("Ini adalah motor dengan merek: " + merek);
    }

  }
