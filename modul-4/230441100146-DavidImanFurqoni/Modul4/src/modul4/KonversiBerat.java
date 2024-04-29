package modul4;

class KonversiBerat extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("kg") && keSatuan.equalsIgnoreCase("ton")) {
            return nilai / 1000; // 1 ton = 1000 kg
        }// Kilogram ke Ton
        
        
        else if (dariSatuan.equalsIgnoreCase("ton") && keSatuan.equalsIgnoreCase("kg")) {
            return nilai * 1000; // 1 ton = 1000 kg
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }// Ton ke Kilogram
    }
}
            
