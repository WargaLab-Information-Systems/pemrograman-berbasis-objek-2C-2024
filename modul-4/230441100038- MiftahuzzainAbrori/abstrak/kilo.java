package abstrak;

public class kilo extends ABSTRAK {
//    OVERRIDE UNTUK MENGUBAH ATAU MENIMPA METHOD PADA SUPERCLASS
    @Override
    double konversi(double nilai, String Pilihan) {
        
        if (Pilihan.equalsIgnoreCase("C")) {
            return nilai / 1000; // 1 ton = 1000 kg
        }// Kilogram ke Ton
        
        
        else if (Pilihan.equalsIgnoreCase("D")) {
            return nilai * 1000; // 1 ton = 1000 kg
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }// Ton ke Kilogram
    }
}

