package modul4;

public class Suhu extends KonversiSatuan{
    
    public Suhu(double nilai, String satuanAsal, String satuanBenar) {
        super(nilai, satuanAsal, satuanBenar);
    }

    @Override
    double konversi(){
        double hasil = 0.0;

        if (satuanAsal.equalsIgnoreCase("Celsius")){
            if (satuanBenar.equalsIgnoreCase("Reamur")) {
                hasil = (nilai * 4 / 5);           
            } else if (satuanBenar.equalsIgnoreCase("Kelvin")) {
                hasil = (nilai + 273);
            } else if (satuanBenar.equalsIgnoreCase("Fahrenheit")) {
                hasil = (nilai * 9 / 5) + 32;
            }
        }
        
        else if (satuanAsal.equalsIgnoreCase("Reamur")) {
            if (satuanBenar.equalsIgnoreCase("Celsius")) {
                hasil = (nilai * 5 / 4);
            } else if (satuanBenar.equalsIgnoreCase("Kelvin")) {
                hasil = (nilai * 5 / 4) + 273;
            }else if (satuanBenar.equalsIgnoreCase("Fahrenheit")) {
                hasil = (nilai * 9 / 4) + 32;
            }
        }

        else if (satuanAsal.equalsIgnoreCase("Fahrenheit")) {
            if (satuanBenar.equalsIgnoreCase("Celsius")) {
                hasil = (nilai - 32) * 5 / 9;
            } else if (satuanBenar.equalsIgnoreCase("Reamur")) {
                hasil = (nilai - 32) * 4 / 9;
            } else if (satuanBenar.equalsIgnoreCase("Kelvin")) {
                hasil = 5 / 9 * (nilai - 32) + 273;
            }
        }

        else if (satuanAsal.equalsIgnoreCase("Kelvin")) {
            if (satuanBenar.equalsIgnoreCase("Celsius")) {
                hasil = (nilai - 273);
            } else if (satuanBenar.equalsIgnoreCase("Reamur")) {
                hasil = (nilai - 732) * 4 / 5;
            } else if (satuanBenar.equalsIgnoreCase("Fahrenheit")) {
                hasil = 9 / 5 * (nilai - 273) + 32;
            }
        }
        
        return hasil;
    }
}