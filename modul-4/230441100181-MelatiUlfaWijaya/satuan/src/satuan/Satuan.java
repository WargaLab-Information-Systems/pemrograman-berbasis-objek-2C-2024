/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package satuan;

/**
 *
 * @author Lenovo
 */
public abstract class Satuan {
    
    double nilai;
    String satuanAsli, satuanTujuan;
//construktor
    public Satuan(double nilai, String satuanAsli, String satuanTujuan) {
        this.nilai = nilai;
        this.satuanAsli = satuanAsli;
        this.satuanTujuan=satuanTujuan;
    }
    
    public abstract double Conversikan();

//    public double getNilai() {
//        return nilai;
//    }
//
//    public String getSatuanAsli() {
//        return satuanAsli;
//    }
}
