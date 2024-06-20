package modul4.praktikumpbo;

// Konverter Panjang
class KonverterPanjang extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Meter ke Centimeter
        if (dariSatuan.equals("m") && keSatuan.equals("cm")) {
            return nilai * 100;
        }
        // Centimeter ke Meter
        else if (dariSatuan.equals("cm") && keSatuan.equals("m")) {
            return nilai / 100;
        } 
        
        else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi panjang");
        }
    }
}
