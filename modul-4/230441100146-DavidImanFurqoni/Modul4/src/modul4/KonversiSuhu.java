package modul4;

class KonversiSuhu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        
        if (dariSatuan.equalsIgnoreCase("C") && keSatuan.equalsIgnoreCase("F")) {
            return nilai * 9 / 5 + 32;
        }// Celsius ke Fahrenheit
        
        else if (dariSatuan.equalsIgnoreCase("F") && keSatuan.equalsIgnoreCase("C")) {
            return (nilai - 32) * 5 / 9;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi suhu");
        }// Fahrenheit ke Celsius
    }
}

