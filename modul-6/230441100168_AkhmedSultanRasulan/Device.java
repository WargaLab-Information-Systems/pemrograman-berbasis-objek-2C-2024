package device;
import java.util.Scanner;

  interface Kamera{
        void ambilfoto();
        void ambilvidio();
    }
    interface Bluetooth{
        void kirimfile();
        void terimafile();
        void koneksiperangkat();
    }
    interface WIFI{
        void carijaringan();
        void hubungkanjaringan();
        void lupakanjaringan();
    }
    interface GPS{
        void ambilkordinat();
    }
    abstract class gedget implements Kamera,Bluetooth,WIFI,GPS{
       String Model,Merek;
       public abstract void info();
    }
    
    
    class Smartphone extends gedget{      
     public void Smartphone(String Model, String Merek){
         super.Model=Model;
         super.Merek=Merek;
     }
           
    @Override
    public void ambilfoto(){
        System.out.println(super.Merek+" bisa mengambil foto dengan 6x zoom");
    }
    @Override
    public void ambilvidio(){
        System.out.println(super.Merek+" pengambilan video dengan kualitas HD");
    }
    @Override
    public void kirimfile(){
        System.out.println(super.Merek+" dapat mengirim file antar smartphone lewat bluetooth");
    }
    @Override
    public void terimafile(){
        System.out.println(super.Merek+" dapat meerima file antar smartphone lewat bluetooth");
    }
    @Override
    public void koneksiperangkat(){
        System.out.println(super.Merek+" meimiliki fitur menghubungjan dengan perangkat");
    }
    @Override
    public void carijaringan(){
        System.out.println(super.Merek+" bisa mencari jaringan wifi dengan jangkauan kecil");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println(super.Merek+" bisa menghubungkan ke jaringan wifi secara cepat");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println(super.Merek+" jaringan wifi bisa di diputuskan");
    }
    @Override
    public void ambilkordinat(){
        System.out.println(super.Merek+" dapat mengetahui kordinat kita");
    }
    @Override
    public void info() {
        System.out.println("INFORMASI SMARTPHONE");
        System.out.println("Merk : " + super.Merek);
        System.out.println("Model : " + super.Model  );
        this.ambilfoto();
        this.ambilvidio();
        this.kirimfile();
        this.terimafile();
        this.koneksiperangkat();
        this.carijaringan();
        this.hubungkanjaringan();
        this.lupakanjaringan();
        this.ambilkordinat();
        System.out.println("--------------------");
    }
    }


    class Tablet extends gedget{
       public void Tablet(String Model,String Merek){
           super.Model=Model;
           super.Merek=Merek;
       }
               
    @Override
    public void ambilfoto(){
        System.out.println(super.Merek+" pengambilan foto dengan banyak filter");
    }
    @Override
    public void ambilvidio(){
        System.out.println(super.Merek+" pengambilan kamera yang luas");
    }
    @Override
    public void kirimfile(){
        System.out.println(super.Merek+" pengriman file yang cepat");
    }
    @Override
    public void terimafile(){
        System.out.println(super.Merek+" menerima file kapan saja");
    }
    @Override
    public void koneksiperangkat(){
        System.out.println(super.Merek+" dapat tersambung dengan perangkat lain yang memiliki bluetooth");
    }
    @Override
    public void carijaringan(){
        System.out.println(super.Merek+" mencari jaringan terdekat");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println(super.Merek+" otomatis hubungkan pada wifi tanpa password");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println(super.Merek+" memutuskan jaringan wifi yang tanpa iternet");
    }
    @Override
    public void ambilkordinat(){
        System.out.println(super.Merek+" dapat mencari kordinat");
    }
    @Override
    public void info() {
        System.out.println("INFORMASI TABLET");
        System.out.println("Merk : " + super.Merek);
        System.out.println("Model : " + super.Model);
        this.ambilfoto();
        this.ambilvidio();
        this.kirimfile();
        this.terimafile();
        this.koneksiperangkat();
        this.carijaringan();
        this.hubungkanjaringan();
        this.lupakanjaringan();
        this.ambilkordinat();
        System.out.println("--------------------");
    }
    }

    class Leptop extends gedget{
        public void Leptop(String Model ,String Merek){
            super.Model = Model;
            super.Merek = Merek;
        }
        
    @Override
    public void ambilfoto(){
        System.out.println(super.Merek+" pengambilan foto dengan kamera depan");
    }
    @Override
    public void ambilvidio(){
        System.out.println(super.Merek+" dapat merekam layar ");
    }
    @Override
    public void kirimfile(){
        System.out.println(super.Merek+" kirim file mudah");
    }
    @Override
    public void terimafile(){
        System.out.println(super.Merek+" terima file cepat");
    }
    @Override
    public void koneksiperangkat(){
        System.out.println(super.Merek+" terhubung dengan perangkat sangat mudah");
    }
    @Override
    public void carijaringan(){
        System.out.println(super.Merek+" jangkauan wifi luas");
    }
    @Override
    public void hubungkanjaringan(){
        System.out.println(super.Merek+" hubungksn jsringsn terdekst");
    }
    @Override
    public void lupakanjaringan(){
        System.out.println(super.Merek+" mudah memutuskan jaringan");
    }
    @Override
    public void ambilkordinat(){
        System.out.println(super.Merek+" pengambilan kordinat cepat");
    }
    @Override
    public void info() {
        System.out.println("INFORMASI LEPTOP");
        System.out.println("Merk : " + super.Merek);
        System.out.println("Model : " + super.Model );
        this.ambilfoto();
        this.ambilvidio();
        this.kirimfile();
        this.terimafile();
        this.koneksiperangkat();
        this.carijaringan();
        this.hubungkanjaringan();
        this.lupakanjaringan();
        this.ambilkordinat();
    }
    }

public class Device { 
    public static void main(String[] args) {      
    Scanner inp = new Scanner(System.in);
    
               
    gedget ggt[] = new gedget[6];
    ggt[0]=new Smartphone();
    System.out.println("Masukkan informasi Smartphone");
    System.out.print("Merek :");
    String Merek1  = inp.next();
    System.out.print("Model :");
    String Model = inp.next();
    ggt[0].Merek= Merek1;
    ggt[0].Model=Model;
    ggt[1]=new Smartphone();
    System.out.print("Merek :");
    Merek1  = inp.next();
    System.out.print("Model :");
    String Model1 = inp.next();
    ggt[1].Merek= Merek1;
    ggt[1].Model= Model1;   
    ggt[2]=new Tablet();
    System.out.println("\nMasukkan informasi Tablet");
    System.out.print("Merek :");
    Merek1  = inp.next();
    System.out.print("Model :");
    Model1 = inp.next();
    ggt[2].Merek= Merek1;
    ggt[2].Model= Model1;    
    ggt[3]=new Tablet();
    System.out.print("Merek :");
    Merek1  = inp.next();
    System.out.print("Model :");
    Model1 = inp.next();
    ggt[3].Merek= Merek1;
    ggt[3].Model= Model1;
    ggt[4]=new Leptop();
    System.out.println("\nMasukkan informasi Leptop");
    System.out.print("Merek :");
    Merek1  = inp.next();
    System.out.print("Model :");
    Model1 = inp.next();
    ggt[4].Merek= Merek1;
    ggt[4].Model= Model1;   
    ggt[5]=new Leptop();
    System.out.print("Merek :");
    Merek1  = inp.next();
    System.out.print("Model :");
    Model1 = inp.next();
    ggt[5].Merek= Merek1;
    ggt[5].Model= Model1;
    

        for (gedget ggt1 : ggt) {
            ggt1.info();        
            
        }
        
    }
 
}
    


    

    

