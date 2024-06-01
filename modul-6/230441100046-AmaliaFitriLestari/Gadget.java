/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gadget;

interface  Kamera {
    void AmbilFoto();
    void RekamVidio();
}

interface  Bluetooth {
    void KirimFile();
    void TerimaFile();
    void KoneksiPerangkat();
}

interface  WiFi {
    void CariJaringan();  
    void HubungkanJaringan();
    void LupakanJaringan();
}

interface  GPS {
    void AmbilKoordinat();

}

abstract class Gadget implements Kamera, Bluetooth, WiFi,GPS {
    String merek;
    String model;
    
    public Gadget(String merek, String model){
        this.merek = merek;
        this.model = model;
    }
    
    public abstract void TampilkanData();
    
     @Override
    public void AmbilFoto(){
        System.out.println("-dapat mengambil Foto dengan merek "+merek);
    }
    
    @Override
    public void RekamVidio(){
        System.out.println("-dapat merekam foto dengan merek "+merek);
    }
    @Override
    public void KirimFile(){
        System.out.println("-dapat kirim file dengan merek "+merek);
    }
    @Override
    public void TerimaFile(){
        System.out.println("-dapat menerima file dengan merek "+merek);
    }
    @Override
    public void KoneksiPerangkat(){
        System.out.println("-dapat menyambungkan koneksi dengan merek "+merek);
    }
    @Override
    public void CariJaringan(){
        System.out.println("-dapat mencari jaringan dengan merek "+merek);
    }
    @Override
    public void HubungkanJaringan(){
        System.out.println("-dapat menghubungkan jaringan dengan merek "+merek);
    }
    @Override
    public void LupakanJaringan(){
        System.out.println("-dapat melupakan jaringan dengan merek "+merek);
    }
    @Override
    public void AmbilKoordinat(){
        System.out.println("-dapat mengambil koordinat dengan merek "+merek);
    }
}


// class smarphone
class smarphone extends Gadget{
    public smarphone(String merek, String model){
        super(merek,model);
    }

    @Override
    public void TampilkanData(){
        System.out.println("Smartphone dengan Merek: " + merek + ", Model: " + model);
    }    
}

//class tablet
class tablet extends Gadget{
    public tablet(String merek, String model){
        super(merek,model);
    }

    @Override
    public void TampilkanData(){
        System.out.println("Tablet dengan Merek: " + merek + ", Model: " + model);
    }    
}

// class laptop
class laptop extends Gadget{
    public laptop(String merek, String model){
        super(merek,model);
    }

    @Override
    public void TampilkanData(){
        System.out.println("laptop dengan Merek: " + merek + ", Model: " + model);
    }    
  }   
