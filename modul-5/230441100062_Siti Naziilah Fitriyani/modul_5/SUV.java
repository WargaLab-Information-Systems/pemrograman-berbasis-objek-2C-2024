/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_5;

/**
 *
 * @author Acer
 */
public class SUV extends Mobil{
    SUV(String merek, String model, int tahun) {
        super(merek, model, tahun);
    }

    @Override
    public void showFeature() {
        System.out.println(" Jenis Mobil        : SUV ");
        super.showFeature();
        System.out.println(" Kelebihan          : Kemampuan off-road yang baik.");
    }
}
