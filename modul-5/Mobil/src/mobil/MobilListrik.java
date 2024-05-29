/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

class MobilListrik extends Mobil {
    public MobilListrik(String merk, String model, String tahunProduksi) {
        super(merk, model, tahunProduksi);
    }


    @Override
    public void evaluate() {
        
        System.out.println("Ramah lingkungan dan memiliki biaya operasional yang rendah.");
    }
}