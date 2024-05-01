/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversi;
abstract class KonversiSatuan {
    protected double value;

    public KonversiSatuan(double value) {
        this.value = value;
    }

    public abstract double konversi(String SatuanAwal, String to);//implementasi nya di kelas turunan
}
