/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_5;

/**
 *
 * @author Acer
 */
public class MPV extends Mobil{
    MPV(String merek, String model, int tahun) {
        super(merek, model, tahun);
    }

    @Override
    public void showFeature() {
        System.out.println(" Jenis Mobil        : Mpv ");
        super.showFeature();
        System.out.println(" Kelebihan          : Kapasitas penumpang yang besar dan ruang bagasi yang luas.");
    }
}
