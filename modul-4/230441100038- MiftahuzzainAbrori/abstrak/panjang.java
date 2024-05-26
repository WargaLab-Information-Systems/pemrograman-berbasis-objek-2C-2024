package abstrak;

public class panjang extends ABSTRAK {
//    OVERRIDE UNTUK MENGUBAH ATAU MENIMPA METHOD PADA SUPERCLASS
    @Override
    double konversi(double nilai, String Pilihan) {
        
        if (Pilihan.equalsIgnoreCase("A")) {
            return nilai * 100;
        }// Meter ke Centimeter
        
        else if (Pilihan.equalsIgnoreCase("B")) {
            return nilai / 100;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi panjang");
        }// Centimeter ke Meter
    }

    
}
