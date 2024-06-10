/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author pinokio
 */
public class Sepeda extends Kendaraan {
    public Sepeda(String merek, String model, char status, int tahun) {
        super("Sepeda", merek, model, status, tahun);
    }

    @Override
    public String getInformasiPenyewaan() {
        return "Sepeda: " + super.getInformasiPenyewaan();
    }
}
