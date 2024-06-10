/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author pinokio
 */
public class Mobil extends Kendaraan{
    public Mobil(String merek, String model, char status, int tahun) {
        super("Mobil", merek, model, status, tahun);
    }
    //untuk mengakses sebuah nilai yang tertimpa ovveride 
    @Override  //untuk mendefinisikan ulang kelas turunan
    public String getInformasiPenyewaan() {
        return "Mobil: " + super.getInformasiPenyewaan();
    }
}
