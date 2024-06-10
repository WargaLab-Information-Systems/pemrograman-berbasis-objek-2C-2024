/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package satuan;

/**
 *
 * @author pinokio
 */
public abstract class satuan  {
    double nilai;
    String satuanAsal;
    
    public satuan(double nilai, String satuanAsal){
        this.nilai = nilai;
        this.satuanAsal= satuanAsal;
    }
    
    public abstract double KonversiKe(String satuanTujuan);
    public double getNilai(){
        return nilai;
    }
    
    public String getsatuanAsal(){
        return satuanAsal;
    }

}

