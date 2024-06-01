/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;
class MobilListrik extends Mobil {
    public MobilListrik(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void showFeature() {
        System.out.println("Mobil Listrik dengan merek "+merk + " , model " + model + " dan tahun " + tahunProduksi + " memiliki keuntungan yakni ramah lingkungan.");
    }
}    

