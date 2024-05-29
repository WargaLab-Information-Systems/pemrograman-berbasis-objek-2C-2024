package tentang.manusia;

class Manusia{
    String nama;//atribut->variabel->hal yang dimiliki object/class
    int umur;
    String alamat;

    void bergerakk() {
        System.out.println(nama + " " +"sedang berjalan");
    }
    void berlari() {   
        System.out.println(nama +" "+ " sedang berlari");
        }
}
public class TentangManusia {

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        manusia1.nama = "Alini";
        manusia1.umur = 18;
        manusia1.alamat ="Gresik, Bungah";        
       
        System.out.println("Saya Bernama :"+manusia1.nama);
        System.out.println("Saya Berumur :"+ manusia1.umur);
        System.out.println("Saat ini saya tinggal di :"+ manusia1.alamat);
        manusia1.bergerakk();
        manusia1.berlari();
        
    }
}
