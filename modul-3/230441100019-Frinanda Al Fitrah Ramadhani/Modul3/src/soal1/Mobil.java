/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author IBUCOMP
 */
public class Mobil extends Kendaraan{
    String jenis = "Mobil";
    
    public Mobil(String merek, String model, char status, int tk) {
        super(merek, model, status, tk);
    }
    
    @Override
    void info_penyewaan(){
        System.out.println("\n == Informasi Kendaraan ==");
        System.out.println("Jenis Kendaraan  : " + jenis);
        super.info_penyewaan();
    }
    
}
