/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

/**
 *
 * @author pinokio
 */
public class berat extends satuan {

    public berat(double nilai, String darisatuan) {
        super(nilai, darisatuan);
    }
    @Override
    public double KonversiKe(String satuanTujuan) {
        switch (satuanTujuan) {
            case "Meter":
                if (getsatuanAsal().equals("kilometer")) { 
                    return getNilai() * 1000;
                } else if (getsatuanAsal().equals("centimeter")) {
                    return getNilai() / 100;
                } else {
                    return getNilai();
                }
            case "Kilometer":
                if (getsatuanAsal().equals("meter")) {
                    return getNilai() / 1000;
                } else if (getsatuanAsal().equals("centimeter")) {
                    return getNilai() / 100000;
                } else {
                    return getNilai();
                }
            case "Centimeter":
                if (getsatuanAsal().equals("meter")) {
                    return getNilai() * 100;
                } else if (getsatuanAsal().equals("kilometer")) {
                    return getNilai() * 100000;
                } else {
                    return getNilai();
                }
            default:
                return getNilai();
        }    
       }
}

