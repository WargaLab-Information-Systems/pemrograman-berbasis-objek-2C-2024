package modul4;

public class Panjang extends KonversiSatuan{
    
    public Panjang(double nilai, String satuanAsal, String satuanBenar) {
        super(nilai, satuanAsal, satuanBenar);
    }
    
    @Override
    double konversi(){
        double hasil = 0.0;
      
        if (satuanAsal.equalsIgnoreCase("Kilometer")) {
            if (satuanBenar.equalsIgnoreCase("Hektometer")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Dekameter")){
                hasil= nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Meter")){
                hasil = nilai * 1000;
            } else if (satuanBenar.equalsIgnoreCase("Desimeter")) {
                hasil = nilai * 10000;
            } else if (satuanBenar.equalsIgnoreCase("Centimeter")) {
                hasil = nilai * 100000;
            } else if (satuanBenar.equalsIgnoreCase("Milimeter")) {
                hasil = nilai * 1000000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Hektometer")) {
            if (satuanBenar.equalsIgnoreCase("Kilometer")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Dekameter")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Meter")) {
                hasil = nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Desimeter")) {
                hasil = nilai * 1000;
            } else if (satuanBenar.equalsIgnoreCase("Centimeter")) {
                hasil = nilai * 10000;
            } else if (satuanBenar.equalsIgnoreCase("Milimeter")) {
                hasil = nilai * 10000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Dekameter")) {
            if (satuanBenar.equalsIgnoreCase("Kilometer")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Hektometer")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Meter")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Desimeter")) {
                hasil = nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Centimeter")) {
                hasil = nilai * 1000;
            } else if (satuanBenar.equalsIgnoreCase("Milimeter")) {
                hasil = nilai * 10000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Meter")) {
            if (satuanBenar.equalsIgnoreCase("Kilometer")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Hektometer")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Dekameter")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Desimeter")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Centimeter")) {
                hasil = nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Milimeter")) {
                hasil = nilai * 1000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Desimeter")) {
            if (satuanBenar.equalsIgnoreCase("Kilometer")) {
                hasil = nilai / 10000;
            } else if (satuanBenar.equalsIgnoreCase("Hektometer")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Dekameter")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Meter")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Centimeter")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Milimeter")) {
                hasil = nilai * 100;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Centimeter")) {
            if (satuanBenar.equalsIgnoreCase("Kilometer")) {
                hasil = nilai / 100000;
            } else if (satuanBenar.equalsIgnoreCase("Hektometer")) {
                hasil = nilai / 10000;
            } else if (satuanBenar.equalsIgnoreCase("Dekameter")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Meter")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Desimeter")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Milimeter")) {
                hasil = nilai * 10;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Milimeter")) {
            if (satuanBenar.equalsIgnoreCase("Kilometer")) {
                hasil = nilai / 1000000;
            } else if (satuanBenar.equalsIgnoreCase("Hektometer")) {
                hasil = nilai / 100000;
            } else if (satuanBenar.equalsIgnoreCase("Dekameter")) {
                hasil = nilai / 10000;
            } else if (satuanBenar.equalsIgnoreCase("Meter")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Desimeter")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Centimeter")) {
                hasil = nilai / 10;
            }
        }

        return hasil;
    }
}