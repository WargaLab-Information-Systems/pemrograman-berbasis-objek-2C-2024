package Kndraan;

public class Kndraan {
    String jenis, merk, model ;
    char status ;
    int tahun ;

    Kndraan(String jenis, String merk, String model, char status, int tahun){
        this.jenis = jenis ;
        this.merk = merk ; 
        this.model = model ;
        this.status = status ;
        this.tahun = tahun ; 
    }

    void display(){
        System.out.println("\nInformasi Kendaraan:");
        System.out.println("Jenis Kendaraan : "+ jenis);
        System.out.println("Merk            : "+ merk);
        System.out.println("Model           : "+ model);
        System.out.println("Tahun Kendaraan : "+ tahun);
    }
    
    char getstatus(){
        return status; 
    }
}
