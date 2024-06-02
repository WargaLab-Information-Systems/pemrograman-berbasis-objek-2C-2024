package modul4.praktikumpbo;

// Konverter Berat
class KonverterBerat extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Kilogram ke Ton
        if (dariSatuan.equals("kg") && keSatuan.equals("ton")) {
            return nilai / 1000; // 1 ton = 1000 kg
        }
        // Ton ke Kilogram
        else if (dariSatuan.equals("ton") && keSatuan.equals("kg")) {
            return nilai * 1000; // 1 ton = 1000 kg
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }
    }
}
