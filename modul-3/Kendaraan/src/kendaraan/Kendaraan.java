package kendaraan;
public class Kendaraan {
    String jeniskendaraan;
    String merekkendaraan;
    String modelkendaraan;
    char statuskendaraan;
    int tahunkendaraan;
 
     // Konstruktor
    Kendaraan(String jeniskendaraan, String merekkendaraan, String modelkendaraan,
            char statuskendaraan, int tahunkendaraan) {
        this.jeniskendaraan    = jeniskendaraan;
        this.merekkendaraan    = merekkendaraan;
        this.modelkendaraan    = modelkendaraan;
        this.statuskendaraan   = statuskendaraan;
        this.tahunkendaraan    = tahunkendaraan;
    }
   
    // Menampilkan informasi kendaraan
    void displayInfo() {
        System.out.println("jenis Kendaraan: " + jeniskendaraan);
        System.out.println("merek kendaraan: " + merekkendaraan);
        System.out.println("model kendaraan: " + modelkendaraan);
        System.out.println("tahun kendaraan: " + tahunkendaraan);
     }  
    
    // Getter untuk nama
    char getstatuskendaraan() {
        return statuskendaraan;
        }
    
}
//    void displayInfo() {
//       System.out.println("jenis Kendaraan: " + jeniskendaraan);
//       System.out.println("mere kendaraan: " + merekkendaraan);
//       System.out.println("model kendaraan: " + modelkendaraan);
//       System.out.println("tahun kendaraan: " + tahunkendaraan); 
//    }

//    void displayInfo() {
//        System.out.println("jenis Kendaraan: " + jeniskendaraan);
//        System.out.println("mere kendaraan: " + merekkendaraan);
//        System.out.println("model kendaraan: " + modelkendaraan);
//        System.out.println("tahun kendaraan: " + tahunkendaraan);
//    }
//}