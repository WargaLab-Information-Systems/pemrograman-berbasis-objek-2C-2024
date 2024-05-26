package gadgett;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Gadgett> listObj = new ArrayList<>();

        boolean while1 = true;
        Gadgett gadget = null;
        while (while1) {
            
            boolean while2 = true;
            while (while2) {
                System.out.println("Pilih");
                System.out.println("Opsi 1 : Tambah data");
                System.out.println("Opsi 2 : Tampilkan data");
                System.out.println("Opsi 3 : Pilih data");;
                System.out.println("Opsi 4 : keluar");
                System.out.print("Pilih (1 / 2  / 3 / 4) : ");
                String Pilih = inputUser.nextLine();

                boolean while3 = true;
                switch (Pilih) {
                    case "1":
                        while (while3) {
                            System.out.println("Pilih jenis");
                            System.out.println("Jenis 1 : Smartphone");
                            System.out.println("Jenis 2 : Tablet");
                            System.out.println("Jenis 3 : Laptop");
                            System.out.print("Input (1 / 2 / 3) : ");
                            String PilihJenis = inputUser.nextLine();

                            switch (PilihJenis) {
                                case "1":
                                    gadget = new Smartphone();
                                    while3 = false;
                                    break;
                                case "2":
                                    gadget = new Tablet();
                                    while3 = false;
                                    break;
                                case "3":
                                    gadget = new Laptop();
                                    while3 = false;
                                    break;                        
                                default:
                                    System.out.println("Input tidak valid..!");
                                    break;
                            }
                            
                        }
                        System.out.println("Input data");
                        System.out.print("Input Merk : ");
                        String merk = inputUser.nextLine();
                        System.out.print("Input Model : ");
                        String model = inputUser.nextLine();
                        gadget.setMerk(merk);
                        gadget.setModel(model);
                        listObj.add(gadget);
                        System.out.println("Berhasil menambahkan data...\n");
                            break;

                    case "2":
                        if (listObj.isEmpty()) {
                            System.out.println("Tidak ada Gadget untuk ditampilkan.");
                        } else{
                            System.out.println("Daftar Gadget");
                            for (int index = 0; index < listObj.size() ; index++) {
                                Gadgett listGadget = listObj.get(index);
                                System.out.println(index + 1 + ". Merk  : " + listGadget.Merk);
                                System.out.println("   Model : " + listGadget.Model);
                                
                            }
                        }
                            System.out.println();
                            break;
                    case "3":
                        if (listObj.isEmpty()) {
                            System.out.println("Tidak ada Gadget untuk dipilih.");
                        } else{
                            System.out.println("Daftar Gadget");
                            for (int index = 0; index < listObj.size() ; index++) {
                                Gadgett listGadget = listObj.get(index);
                                System.out.println(index + 1 + ". Merk  : " + listGadget.Merk);
                                System.out.println("   Model : " + listGadget.Model);
                               
                            }
                            boolean while4 = true;
                            while (while4) {
                                System.out.print("Pilih Gadget yang akan digunakan : ");
                                int pilihObj = inputUser.nextInt();
                                inputUser.nextLine();     
                                if (pilihObj > 0 && pilihObj <= listObj.size()) {
                                    gadget.tampilPilih();
                                    while4 = false;
                                } else {
                                    System.out.println("Input tidak valid..!");
                                }
                                
                            }
                        }
                        System.out.println();
                        break;

                    case "4" :
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
}