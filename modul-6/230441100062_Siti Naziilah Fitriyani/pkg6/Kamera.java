/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author Acer
 */
interface Kamera {
    void ambilFoto();
    void rekamVideo();
}

interface Bluetooth {
    void kirimFile();
    void terimaFile();
    void koneksiPerangkat();
}

interface Wifi{
    void cariJaringan();
    void hubungkanJaringan();
    void lupakanJaringan();
}

interface GPS {
    void ambilKoordinat();
}
