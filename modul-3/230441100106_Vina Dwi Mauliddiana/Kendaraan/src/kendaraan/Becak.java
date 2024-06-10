/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author pinokio
 */
public class Becak extends Kendaraan{
    public Becak (String merek, String model, char status, int tahun) {
        super("Becak", merek, model, status, tahun);
    }

    @Override
    public String getInformasiPenyewaan() {
        return "Becak: " + super.getInformasiPenyewaan();
}
}