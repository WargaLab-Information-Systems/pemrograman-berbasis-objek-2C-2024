/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewa;

/**
 *
 * @author Lenovo
 */
public class motor extends kendaraan {
    public motor(String namamerek, String model, char status, int thn){
        super("motor", namamerek, model, status, thn);
    }
    @Override
    public void displayKet() {
        super.displayKet(); // Memanggil metode displayInfo dari kelas induk
        System.out.println("Motor ini bermerek : " + namamerek);
    }

}
