package modul4.praktikumpbo;

// Konverter Suhu
class KonverterSuhu extends Konverter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Celsius ke Fahrenheit
        if (dariSatuan.equals("Celcius") && keSatuan.equals("Fahrenheit")) {
            return nilai * 9 / 5 + 32;
        }
        // Fahrenheit ke Celsius
        else if (dariSatuan.equals("Fahrenreit") && keSatuan.equals("Celcius")) {
            return (nilai - 32) * 5 / 9;
        } 
        
        else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi suhu");
        }
    }
}
