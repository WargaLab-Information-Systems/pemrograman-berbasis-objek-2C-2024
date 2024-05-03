package modul4;

class KonversiPanjang extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("m") && keSatuan.equalsIgnoreCase("cm")) {
            return nilai * 100;
        }// Meter ke Centimeter
        
        else if (dariSatuan.equalsIgnoreCase("cm") && keSatuan.equalsIgnoreCase("m")) {
            return nilai / 100;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi panjang");
        }// Centimeter ke Meter
    }
}

