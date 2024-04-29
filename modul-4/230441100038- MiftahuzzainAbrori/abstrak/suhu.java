package abstrak;

public class suhu extends ABSTRAK {
//    OVERRIDE UNTUK MENGUBAH ATAU MENIMPA METHOD PADA SUPERCLASS
    @Override
    double konversi(double nilai, String Pilihan) {
        
        if (Pilihan.equalsIgnoreCase("G")) {
            return nilai * 9 / 5 + 32 ;
        }// Celsius ke Fahrenheit
        
        else if (Pilihan.equalsIgnoreCase("H")) {
            return 4/5*nilai;
        }// Celcius Ke Reamur

        else if(Pilihan.equalsIgnoreCase("I")){
            return nilai + 273.15;
        }//Celcius Ke Kelvin
        
        else if (Pilihan.equalsIgnoreCase("J")){
            return nilai - 32 * 5 / 9;
        }// Fahrenheit Ke celcius
        
        else if (Pilihan.equalsIgnoreCase("K")){
            return nilai  - 32 * 4 / 9;
        }// Fahrenhei Ke Reamur
        
        else if (Pilihan.equalsIgnoreCase("L")){
            return nilai  - 32 * 5 / 9 + 273;
        }// Fahrenhei Ke Kelvin
        
        else if (Pilihan.equalsIgnoreCase("M")){
            return nilai * 5 / 4;
        }//Reamur Ke Celcius 
        
        else if (Pilihan.equalsIgnoreCase("N")){
            return nilai + 32 * 9 / 4;
        }//Reamur Ke Fahrenheit
        
        else if (Pilihan.equalsIgnoreCase("O")){
            return nilai + 273 * 5 / 4;
        }//Reamur Ke Kevin
        
        else if (Pilihan.equalsIgnoreCase("P")){
            return nilai - 273;
        }//Kelvin Ke Celcius
        
        else if (Pilihan.equalsIgnoreCase("Q")){
            return nilai - 273 * 9 / 5 + 32;
        }//Kelvin Ke Fahrenheit
        
        else if (Pilihan.equalsIgnoreCase("R")){
            return nilai - 732 * 4 / 5;
        }//Kelvin Ke Reamur
        
        throw new IllegalArgumentException();
  
        
   }
} 
