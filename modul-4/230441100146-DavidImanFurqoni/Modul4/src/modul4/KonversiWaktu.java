package modul4;

class KonversiWaktu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("menit") && keSatuan.equalsIgnoreCase("jam")) {
            return nilai / 60;
        }// Menit ke Jam
        
        else if (dariSatuan.equalsIgnoreCase("jam") && keSatuan.equalsIgnoreCase("menit")) {
            return nilai * 60;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi waktu");
        }// Jam ke Menit
    }
}


