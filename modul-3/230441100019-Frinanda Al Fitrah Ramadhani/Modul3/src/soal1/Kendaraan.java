/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author IBUCOMP
 */
public class Kendaraan {
    String merek;
    String model;
    char status;
    int tahun_kendaraan;
    
    Kendaraan(String merek, String model, char status, int tk){
        this.merek = merek;
        this.model = model;
        this.status = status;
        tahun_kendaraan = tk;
    }
    
    void info_penyewaan(){
        System.out.println("Merek Kendaraan  : " + merek);
        System.out.println("Model Kendaraan  : " + model);
        System.out.println("Status Kendaraan : " + status);
        System.out.println("Tahun Kendaraan  : " + tahun_kendaraan);
    }
    
}
