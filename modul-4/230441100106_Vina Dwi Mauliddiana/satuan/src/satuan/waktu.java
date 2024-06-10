/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

/**
 *
 * @author pinokio
 */

public class waktu extends satuan{

    public waktu(double nilai, String darisatuan) {
        super(nilai, darisatuan);
    }
    // Implementasi untuk satuan waktu
@Override
    public double KonversiKe(String satuanTujuan) {
        switch (satuanTujuan) {
            case "Detik":
                if (getsatuanAsal().equals("menit")) {
                    return getNilai() * 60;
                } else if (getsatuanAsal().equals("jam")) {
                    return getNilai() * 3600;
                } else {
                    return getNilai();
                }
            case "Menit":
                if (getsatuanAsal().equals("detik")) {
                    return getNilai() / 60;
                } else if (getsatuanAsal().equals("jam")) {
                    return getNilai() * 60;
                } else {
                    return getNilai();
                }
            case "Jam":
                if (getsatuanAsal().equals("detik")) {
                    return getNilai() / 3600;
                } else if (getsatuanAsal().equals("menit")) {
                    return getNilai() / 60;
                } else {
                    return getNilai();
                }
            default:
                return getNilai();
         }    

        
    }
    
    
}
