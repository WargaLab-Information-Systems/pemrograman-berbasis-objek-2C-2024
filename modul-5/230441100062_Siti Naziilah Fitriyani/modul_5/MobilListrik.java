/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_5;

/**
 *
 * @author Acer
 */
public class MobilListrik extends Mobil{
    MobilListrik(String merek, String model, int tahun) {
        super(merek, model, tahun);
    }

    @Override
    public void showFeature() {
        System.out.println(" Jenis Mobil        : Mobil Listrik");
        super.showFeature();
        System.out.println(" Kelebihan          : Ramah Lingkungan dan biaya operasional yang lebih rendah.");
    }
}
