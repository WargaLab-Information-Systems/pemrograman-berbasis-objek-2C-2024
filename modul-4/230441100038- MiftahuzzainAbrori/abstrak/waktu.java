package abstrak;

public class waktu extends ABSTRAK {
//    OVERRIDE UNTUK MENGUBAH ATAU MENIMPA METHOD PADA SUPERCLASS
    @Override
    double konversi(double nilai, String Pilihan) {
        
        if (Pilihan.equalsIgnoreCase("E")) {
            return nilai * 60; 
        }// Jam Ke Menit
        
        
        else if (Pilihan.equalsIgnoreCase("F")) {
            return nilai / 60; 
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }// Menit Ke Jam
    }
}
