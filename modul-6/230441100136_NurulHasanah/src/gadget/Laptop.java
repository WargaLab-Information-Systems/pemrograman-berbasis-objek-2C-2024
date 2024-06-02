package gadget;

class Laptop extends Gadget implements Bluetooth, Wifi, Kamera, Gps{
    Laptop(String merk, String model){
        super(merk, model);
    }
    
    @Override
    public void ambilFoto() {
        System.out.println("Smartphone dapat mengambil foto");
    }
    @Override
    public void rekamvideo() {
        System.out.println("Smartphone dapat merekam video");
    }

    
    @Override
    public void kirimFile(){
        System.out.println("Laptop dapat mengirim file menggunakan bluetooth");
    }

    @Override
    public void terimaFile() {
        System.out.println("Laptop dapat menerima file menggunakan bluetooth");
    }

    @Override
    public void koneksiPerangkat() {
        System.out.println("Dapat menghubungkan perangkat dengan bluetooth pada laptop"); 
    }
    
    @Override
    public void cariJaringan() {
        System.out.println("Dapat mencari jaringan wifi pada laptop");
    }

    @Override
    public void hubungkanJaringan() {
        System.out.println("Dapat menghubungkan jaringan wifi pada laptop");
    }

    @Override
    public void lupakanJaringan() {
        System.out.println("Lupakan jaringan wifi pada laptop");
    }
    
    @Override
    public void ambilKoordinat() {
        System.out.println("Smartphone dapat mengambil koordinat pad GPS");
    }
    
    @Override
    public void gadget(){
        System.out.println("Laptop merk " +this.merk + " " + "dengan model  " +this.model);
    } 
}