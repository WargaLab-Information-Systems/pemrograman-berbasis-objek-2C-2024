package gadget;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Gadget> listObj = new ArrayList<>();

        boolean while1 = true;
        Gadget elektronik = null;
            
            boolean while2 = true;
            while (while2) {
                System.out.println("<--------Pilih-------->");
                System.out.println("Opsi 1 : Tambah data");
                System.out.println("Opsi 2 : Tampilkan data");
                System.out.println("Opsi 3 : keluar");
                System.out.print("Pilih (1 / 2  / 3 ) : ");
                String Pilih = inputUser.nextLine();

                boolean while3 = true;
                switch (Pilih) {
                    case "1":
                        while (while3) {
                            System.out.println("<-----Pilih jenis----->");
                            System.out.println("Jenis 1 : Smartphone");
                            System.out.println("Jenis 2 : Tablet");
                            System.out.println("Jenis 3 : Laptop");
                            System.out.print("Input (1 / 2 / 3) : ");
                            String PilihJenis = inputUser.nextLine();

                            switch (PilihJenis) {
                                case "1":
                                    elektronik = new Smartphone();
                                    while3 = false;
                                    break;
                                case "2":
                                    elektronik = new Tablet();
                                    while3 = false;
                                    break;
                                case "3":
                                    elektronik = new Laptop();
                                    while3 = false;
                                    break;                        
                                default:
                                    System.out.println("Input tidak valid..!");
                                    break;
                            }
                            
                        }
                        System.out.println("<-----Input data----->");
                        System.out.print("Input Merk : ");
                        String merk = inputUser.nextLine();
                        System.out.print("Input Model : ");
                        String model = inputUser.nextLine();
                        elektronik.setMerk(merk);
                        elektronik.setModel(model);
                        listObj.add(elektronik);
                        System.out.println("Berhasil menambahkan data...\n");
                            break;

                    case "2":
                        System.out.println("<-------Daftar Gadget------->");
                        for (int index = 0; index < listObj.size() ; index++) {
                            Gadget listGadget = listObj.get(index);
                            System.out.println(index + 1 + ". Merk  : " + listGadget.Merk);
                            System.out.println("   Model : " + listGadget.Model);
                            listGadget.tampilPilih();
                            System.out.println("---------------------------");
                        }
                        System.out.println();
                        break;

                  
                            
                    case "3" :
                        System.out.println("Program selesai...");
                        while1 = false;
                        while2 = false;
                        break;
                    default:
                        System.out.println("Input tidak valid..!");
                        break;
                    }        
            }
            
        }
    }