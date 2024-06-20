
package mobil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n->->Tipe Mobil<-<- ");
            System.out.println("1.Mobil Sport");
            System.out.println("2.Mobil Listrik");
            System.out.println("3.Mobil SUV");
            System.out.println("4.Mobil MPV");
            
            Mobil car = new Mobil();
            while (true) {
                System.out.print("Input 1 / 2 / 3 / 4 : ");
                String pilihMobil = inputUser.nextLine();
                if (pilihMobil.equals("1")) {
                    String inputMerk, inputModel;
                    int inputTahunProduksi;
                    System.out.println("Input Data Mobil");
                    System.out.print("Input Merk Mobil : ");
                    inputMerk = inputUser.nextLine();
                    System.out.print("Input Model Mobil : ");
                    inputModel = inputUser.nextLine();
                    System.out.print("Input Tahun Produksi Mobil : ");
                    inputTahunProduksi = inputUser.nextInt();
                    inputUser.nextLine();
                    car = new Sport();
                    car.setAtribute(inputMerk, inputModel, inputTahunProduksi);
                    car.showFeature();
                    car.showFeature(80);
                    break;
                }
                else if (pilihMobil.equals("2")) {
                    String inputMerk, inputModel;
                    int inputTahunProduksi;
                    System.out.println("Input Data Mobil");
                    System.out.print("Input Merk Mobil : ");
                    inputMerk = inputUser.nextLine();
                    System.out.print("Input Model Mobil : ");
                    inputModel = inputUser.nextLine();
                    System.out.print("Input Tahun Produksi Mobil : ");
                    inputTahunProduksi = inputUser.nextInt();
                    inputUser.nextLine();
                    car = new Listrik();
                    car.setAtribute(inputMerk, inputModel, inputTahunProduksi);
                    car.showFeature();
                    car.showFeature("merah");
                    break;
                }
                else if (pilihMobil.equals("3")) {
                    String inputMerk, inputModel;
                    int inputTahunProduksi;
                    System.out.println("Input Data Mobil");
                    System.out.print("Input Merk Mobil : ");
                    inputMerk = inputUser.nextLine();
                    System.out.print("Input Model Mobil : ");
                    inputModel = inputUser.nextLine();
                    System.out.print("Input Tahun Produksi Mobil : ");
                    inputTahunProduksi = inputUser.nextInt();
                    inputUser.nextLine();
                    car = new SUV();
                    car.setAtribute(inputMerk, inputModel, inputTahunProduksi);
                    car.showFeature();
                    car.showFeature(100);
                    break;
                }
                else if (pilihMobil.equals("4")) {
                    String inputMerk, inputModel;
                    int inputTahunProduksi;
                    System.out.println("Input Data Mobil");
                    System.out.print("Input Merk Mobil : ");
                    inputMerk = inputUser.nextLine();
                    System.out.print("Input Model Mobil : ");
                    inputModel = inputUser.nextLine();
                    System.out.print("Input Tahun Produksi Mobil : ");
                    inputTahunProduksi = inputUser.nextInt();
                    inputUser.nextLine();
                    car = new MPV();
                    car.setAtribute(inputMerk, inputModel, inputTahunProduksi);
                    car.showFeature();
                    car.showFeature("Tua");
                    break;
                }
                else{
                    System.out.println("Input yang bener dong..!");
                }
            }
            
            System.out.println();
            while (true) {
                System.out.print("Mau input lagi tidak ? ( y / t ) : ");
                String mau = inputUser.nextLine();
                if (mau.equalsIgnoreCase("y")) {
                    break;
                }else if (mau.equalsIgnoreCase("t")) {
                    System.out.println("program selesai...");
                    lanjut = false;
                    break;
                } else {
                    System.out.println("Inputan salah!");
                }

            }
        }
    }
}