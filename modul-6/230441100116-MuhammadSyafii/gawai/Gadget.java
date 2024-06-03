package gawai;

public abstract class Gadget implements Kamera, Bluetooth, WiFi, GPS {
    String Merk, Model;

    public Gadget(String Merk, String Model) {
        this.Merk = Merk;
        this.Model = Model;
    }

    public abstract void Display();

    @Override
    public void ambilFoto(){
        System.out.println(Merk + " " + Model + " Mengambil Foto");
    }

    @Override
    public void ambilVideo(){
        System.out.println(Merk + " " + Model + " Merekam Video");
    }

    @Override
    public void kirimFile(){
        System.out.println(Merk + " " + Model + " Mengirim File Bluetooth");
    }

    @Override
    public void terimaFile(){
        System.out.println(Merk + " " + Model + " Menerima File Bluetooth");
    }

    @Override
    public void koneksiPerangkat(){
        System.out.println(Merk + " " + Model + " Menghubungkan ke Perangkat Bluetooth");
    }

    @Override
    public void cariJaringan(){
        System.out.println(Merk + " " + Model + " Mencari Jaringan WiFi");
    }

    @Override
    public void hubungkanJaringan(){
        System.out.println(Merk + " " + Model + " Menghubungkan Jaringan WiFi");
    }
    
    @Override
    public void lupakanJaringan(){
        System.out.println(Merk + " " + Model + " Melupakan Jaringan WiFi");
    }

    @Override
    public void ambilKoordinat(){
        System.out.println(Merk + " " + Model + " Mengambil Koordinat tempat");
    }
    
}
