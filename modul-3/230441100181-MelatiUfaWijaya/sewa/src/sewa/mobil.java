/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewa;

/**
 *
 * @author Lenovo
 */
public class mobil extends kendaraan {
//    extends untuk memanggilkan yg ada di kendaraan(induk)
    public mobil (String namamerek, String model, char status, int thn) {
        super("Mobil", namamerek, model, status, thn);
    }
     
    @Override
    public void displayKet() {
        super.displayKet(); // Memanggil metode displayKet dari kelas induk
        System.out.println("Motor ini bermerek : " + namamerek);
    }

  }
