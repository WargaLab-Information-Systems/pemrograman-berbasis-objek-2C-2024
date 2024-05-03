
package manusia;

public class Manusia {
    //variabel>attribut>menyimpan data
     String nama;
     int umur;
     String alamat;
     
     //menginisialisasi
//    public Manusia (String InputNama,int InputUmur,String InputAlamat){
//        nama = InputNama;
//        umur = InputUmur;
//        alamat = InputAlamat;
//    }
    //method berjalan
    public void berjalan() {
        //tipe data yang tidak mengembalikan nilai apapun
        System.out.println( nama + " sedang berjalan.");    
    }
    //Method berlari
    public void berlari(){
        System.out.println( "kemudian " + nama + " sekarang "+" sedang berlari");
    } 
    //mendeklarasikan method>mulai menjalankan program
    public static void main(String[] args) {
        //membuat objek 
        Manusia orang1 = new Manusia();
        orang1.nama="adzikry";
        orang1.umur=19;
        orang1.alamat="Krian";
        System.out.println("nama : "+orang1.nama);
        System.out.println("umur : "+orang1.umur);
        System.out.println("alamat : "+orang1.alamat);
                
        //memanggil method berjalan dan berlari
        orang1.berjalan();
        orang1.berlari();
       
    }
}

