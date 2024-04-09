/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

public class Mobil extends Kendaraan {
    private int pintu;

    public Mobil(String merek, String model, char status, int tahun, int pintu) {
        super("Mobil", merek, model, status, tahun);
        this.pintu = pintu;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Status: " + (status == 'T' ? "Tersedia" : "Disewakan"));
        System.out.println("Tahun Kendaraan: " + tahun);
        System.out.println("Jumlah Pintu: " + pintu);
    }
}

