// Gadget.java
package modul6.praktikumpbo;

interface Kamera {
    void ambilFoto();
    void rekamVideo();
}

interface Bluetooth {
    void kirimFile();
    void terimaFile();
    void koneksiPerangkat();
}

interface WiFi {
    void cariJaringan();
    void hubungkanJaringan();
    void lupakanJaringan();
}

interface GPS {
    void ambilKoordinat();
}

abstract class Gadget implements Kamera, Bluetooth, WiFi, GPS {
    String merk, model;

    Gadget(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    @Override
    public void ambilFoto() {
        System.out.println("Mengambil foto dengan " + merk + " " + model);
    }

    @Override
    public void rekamVideo() {
        System.out.println("Merekam video menggunakan " + merk + " " + model);
    }

    @Override
    public void kirimFile() {
        System.out.println("Mengirim file dari " + merk + " " + model);
    }

    @Override
    public void terimaFile() {
        System.out.println("Menerima file di " + merk + " " + model);
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Menghubungkan perangkat pada " + merk + " " + model);
    }

    @Override
    public void cariJaringan() {
        System.out.println("Mencari jaringan dengan " + merk + " " + model);
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Menghubungkan jaringan dengan " + merk + " " + model);
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Melupakan jaringan dengan " + merk + " " + model);
    }

    @Override
    public void ambilKoordinat() {
        System.out.println("Mengambil koordinat dengan " + merk + " " + model);
    }
}


