package modul4;

public class Waktu extends KonversiSatuan{
    
    public Waktu(double nilai, String satuanAsal, String satuanBenar) {
        super(nilai, satuanAsal, satuanBenar);
    }
    
    @Override
    double konversi(){
        double hasil = 0.0;
      
        if (satuanAsal.equalsIgnoreCase("Detik")) {
            if (satuanBenar.equalsIgnoreCase("Menit")) {
                hasil = nilai / 60;
            } else if (satuanBenar.equalsIgnoreCase("Jam")){
                hasil= nilai / 3600;
            } else if (satuanBenar.equalsIgnoreCase("Hari")){
                hasil = nilai / 86400;
            } 
        }
        
        else if (satuanAsal.equalsIgnoreCase("Menit")) {
            if (satuanBenar.equalsIgnoreCase("Detik")) {
                hasil = nilai * 60;
            } else if (satuanBenar.equalsIgnoreCase("Jam")) {
                hasil = nilai / 60;
            } else if (satuanBenar.equalsIgnoreCase("Hari")) {
                hasil = nilai / 1440;
            } 
        }
        
        else if (satuanAsal.equalsIgnoreCase("Jam")) {
            if (satuanBenar.equalsIgnoreCase("Detik")) {
                hasil = nilai * 3600;
            } else if (satuanBenar.equalsIgnoreCase("Menit")) {
                hasil = nilai * 60;
            } else if (satuanBenar.equalsIgnoreCase("Hari")) {
                hasil = nilai / 24;
            } 
        }
        
        else if (satuanAsal.equalsIgnoreCase("Hari")) {
            if (satuanBenar.equalsIgnoreCase("Detik")) {
                hasil = nilai * 86400;
            } else if (satuanBenar.equalsIgnoreCase("Menit")) {
                hasil = nilai * 1440;
            } else if (satuanBenar.equalsIgnoreCase("Jam")) {
                hasil = nilai * 24;
            } 
        }

        return hasil;
    }
}
