/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

class SUV extends Mobil {
    public SUV(String merk, String model, String tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void evaluate() {
       
        System.out.println("Cocok untuk penggunaan di luar jalan raya dan memiliki kemampuan off-road yang baik.");
    }
}