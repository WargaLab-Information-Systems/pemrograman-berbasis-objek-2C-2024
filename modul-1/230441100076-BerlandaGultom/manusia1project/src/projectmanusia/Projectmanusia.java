package projectmanusia;

    class Manusia {
    //atribut
    String Nama ;
    int Umur ;
    String Alamat ;
    
    /// Method 
    void berjalan (){
        System.out.println(Nama  +  " sedang  berjalan di atas awan");
    }
    void berlari (){
        System.out.println(Nama  +  " sedang  berlari diatas air");
    }
    public class Projectmanusia{
    public static void main(String[] args) {
        // Penggunaan kelas Manusia untuk membuat objek a dan b
        Manusia n = new Manusia();
        Manusia i = new Manusia();
        
        // Mengatur nilai atribut untuk setiap objek
        n.Nama = "Fiandari";
        i.Nama = "Yazi";
        
        n.Umur = 20;
        i.Umur = 6;
        
        n.Alamat = "Bumi";
        i.Alamat= "Mars";
        
        System.out.println("Nama    :"+n.Nama);
        System.out.println("Umur    :"+n.Umur);
        System.out.println("Alamat  :"+n.Alamat);
        n. berjalan();
        n. berlari();
        
        System.out.println("Nama    :"+i.Nama);
        System.out.println("Umur    :"+i.Umur);
        System.out.println("Alamat  :"+i.Alamat);
        i. berjalan();
        i. berlari();
    }
}

}
