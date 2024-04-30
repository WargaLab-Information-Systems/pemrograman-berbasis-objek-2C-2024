package modul4;

public class Berat extends KonversiSatuan{
    
    public Berat(double nilai, String satuanAsal, String satuanBenar) {
        super(nilai, satuanAsal, satuanBenar);
    }
    
    @Override
    double konversi(){
        double hasil = 0.0;
      
        if (satuanAsal.equalsIgnoreCase("Kilogram")) {
            if (satuanBenar.equalsIgnoreCase("Hektogram")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Dekagram")){
                hasil= nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Gram")){
                hasil = nilai * 1000;
            } else if (satuanBenar.equalsIgnoreCase("Desigram")) {
                hasil = nilai * 10000;
            } else if (satuanBenar.equalsIgnoreCase("Centigram")) {
                hasil = nilai * 100000;
            } else if (satuanBenar.equalsIgnoreCase("Miligram")) {
                hasil = nilai * 1000000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Hektogram")) {
            if (satuanBenar.equalsIgnoreCase("Kilogram")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Dekagram")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Gram")) {
                hasil = nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Desigram")) {
                hasil = nilai * 1000;
            } else if (satuanBenar.equalsIgnoreCase("Centigram")) {
                hasil = nilai * 10000;
            } else if (satuanBenar.equalsIgnoreCase("Miligram")) {
                hasil = nilai * 10000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Dekagram")) {
            if (satuanBenar.equalsIgnoreCase("Kilogram")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Hektogram")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Gram")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Desigram")) {
                hasil = nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Centigram")) {
                hasil = nilai * 1000;
            } else if (satuanBenar.equalsIgnoreCase("Miligram")) {
                hasil = nilai * 10000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Gram")) {
            if (satuanBenar.equalsIgnoreCase("Kilogram")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Hektogram")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Dekagram")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Desigram")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Centigram")) {
                hasil = nilai * 100;
            } else if (satuanBenar.equalsIgnoreCase("Miligram")) {
                hasil = nilai * 1000;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Desigram")) {
            if (satuanBenar.equalsIgnoreCase("Kilogram")) {
                hasil = nilai / 10000;
            } else if (satuanBenar.equalsIgnoreCase("Hektogram")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Dekagram")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Gram")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Centigram")) {
                hasil = nilai * 10;
            } else if (satuanBenar.equalsIgnoreCase("Miligram")) {
                hasil = nilai * 100;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Centigram")) {
            if (satuanBenar.equalsIgnoreCase("Kilogram")) {
                hasil = nilai / 100000;
            } else if (satuanBenar.equalsIgnoreCase("Hektogram")) {
                hasil = nilai / 10000;
            } else if (satuanBenar.equalsIgnoreCase("Dekagram")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Gram")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Desigram")) {
                hasil = nilai / 10;
            } else if (satuanBenar.equalsIgnoreCase("Miligram")) {
                hasil = nilai * 10;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Miligram")) {
            if (satuanBenar.equalsIgnoreCase("Kilogram")) {
                hasil = nilai / 1000000;
            } else if (satuanBenar.equalsIgnoreCase("Hektogram")) {
                hasil = nilai / 100000;
            } else if (satuanBenar.equalsIgnoreCase("Dekagram")) {
                hasil = nilai / 10000;
            } else if (satuanBenar.equalsIgnoreCase("Gram")) {
                hasil = nilai / 1000;
            } else if (satuanBenar.equalsIgnoreCase("Desigram")) {
                hasil = nilai / 100;
            } else if (satuanBenar.equalsIgnoreCase("Centigram")) {
                hasil = nilai / 10;
            }
        }

        return hasil;
    }
}