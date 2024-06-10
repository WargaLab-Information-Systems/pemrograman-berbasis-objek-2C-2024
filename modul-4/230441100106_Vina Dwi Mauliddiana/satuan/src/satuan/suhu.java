/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satuan;

/**
 *
 * @author pinokio
 */

 
public class suhu extends satuan{
    public suhu(double nilai, String satuanAsal) {
        super(nilai, satuanAsal);
    }
    @Override
    public double KonversiKe(String satuanTujuan) {
        switch(satuanTujuan){
            case"Celcius":
               if (getsatuanAsal().equals("fahrenheit")) {
                    return (getNilai() + 32) * 5 / 9;
                } else if (getsatuanAsal().equals("kelvin")) {
                    return getNilai() + 273.15;
                } else {
                    return getNilai();
                }
            case "Fahrenheit":
                if (getsatuanAsal().equals("celcius")) {
                    return (getNilai() * 9 / 5) + 32;
                } else if  (getsatuanAsal().equals("kelvin")) {
                    return (getNilai() - 273.15) * 9 / 5 + 32;
                } else {
                    return getNilai();
                }
            case "Kelvin":
                if (getsatuanAsal().equals("celcius")) {
                    return getNilai() + 273.15;
                } else if (getsatuanAsal().equals("fahrenheit")) {
                    return (getNilai() - 32) * 5 / 9 + 273.15;
                } else {
                    return getNilai();
                }
            default:
                return getNilai();

        }
          
    }
        }

