/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

class MPV extends Mobil {
    public MPV(String merk, String model, String tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

  
    @Override
    public void evaluate() {
       
        System.out.println("Nyaman untuk perjalanan keluarga dan memiliki ruang bagasi yang luas.");
    }
}
