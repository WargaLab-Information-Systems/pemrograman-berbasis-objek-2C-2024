
package tugascoding;

interface Kamera {
    void ambilFoto();
    void rekamVideo();
}

interface Bluetooth {
    void kirimFile();
    void terimaFile();
    void koneksiPerangkat();
}

interface WiFi{
    void cariJaringan();
    void hubungkanJaringan();
    void lupakanJaringan();
}

interface Gps {
    void ambilKoordinat();
}

abstract class Gadget implements Kamera, Bluetooth, WiFi, Gps{
    String Merk, Model;
    
    abstract void displayInfo();
}
