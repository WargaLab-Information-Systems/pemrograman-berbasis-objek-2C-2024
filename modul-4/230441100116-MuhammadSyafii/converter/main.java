package converter;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean lanjut = true;

        while (lanjut) {
   
            System.out.print("Masukkan nilai: ");
            String inputvalue = scanner.nextLine();
           
            
            if (inputvalue.length() > 11){
                System.out.println("error batas input hanya sampai 11 angka");
                continue;
            }
            
            Double value = Double.parseDouble(inputvalue);
        
            
            System.out.println("\n");
            System.out.println("1. Satuan Waktu : celsius, fahrenheit, kelvin");
            System.out.println("2. Satuan Panjang : centimeter, meter, kilometer");
            System.out.println("3. Satuan Berat : gram, kilogram, pound");
            System.out.println("4. Satuan Waktu : second, minute, hour \n");

            System.out.print("Masukkan satuan awal: ");
            String unitFrom = scanner.nextLine().toLowerCase();

            System.out.print("Masukkan satuan tujuan: ");
            String unitTo = scanner.nextLine().toLowerCase();

            double convertedValue = 0;

            Converter converter = null;

            if (unitFrom.equals("celsius") || unitFrom.equals("fahrenheit") || unitFrom.equals("kelvin")) {
                converter = new suhu();
            } else if (unitFrom.equals("centimeter") || unitFrom.equals("meter") || unitFrom.equals("kilometer")) {
                converter = new panjang();
            } else if (unitFrom.equals("gram") || unitFrom.equals("kilogram") || unitFrom.equals("pound")) {
                converter = new berat();
            } else if (unitFrom.equals("second") || unitFrom.equals("minute") || unitFrom.equals("hour")) {
                converter = new waktu();
            } else {
                System.out.println("Yang bener kalo input");
                continue;
            }

            convertedValue = converter.convert(value, unitFrom, unitTo);

            System.out.println(value + " " + unitFrom + " = " + convertedValue + " " + unitTo);

            System.out.print("Ingin melakukan konversi lagi? (y/n): ");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("y")) {
                lanjut = false;
            }
        }

        scanner.close();
    }
}
