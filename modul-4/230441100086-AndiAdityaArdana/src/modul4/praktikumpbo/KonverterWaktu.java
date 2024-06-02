package modul4.praktikumpbo;

// Konverter Waktu
class KonverterWaktu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Menit ke Jam
        if (dariSatuan.equals("menit") && keSatuan.equals("jam")) {
            return nilai / 60;
        }
        // Jam ke Menit
        else if (dariSatuan.equals("jam") && keSatuan.equals("menit")) {
            return nilai * 60;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi waktu");
        }
    }
}
