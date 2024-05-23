import java.util.*;
public class App {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Gadget> listObj = new ArrayList<>();

        boolean while1 = true;
        while (while1) {
            System.out.println("<--------Pilih-------->");
            System.out.println("|1 | Tambah data      |");
            System.out.println("|2 | Tampilkan data   |");
            System.out.println("|3 | Fitur data       |");
            System.out.println("|4 | hapus data       |");
            System.out.println("|5 | edit data        |");
            System.out.println("|6 | keluar           |");
            System.out.println("<--------------------->");
            System.out.print("Pilih (1 / 2  / 3 / 4 / 5 / 6) : ");
            String Pilih = inputUser.nextLine();

            boolean while2 = true;
            switch (Pilih) {
                case "1" :
                    Gadget elektronik1 = null;
                    Gadget elektronik2 = null;
                    while (while2) {
                        System.out.println("<-----Pilih jenis----->");
                        System.out.println("|1 | Smartphone       |");
                        System.out.println("|2 | Tablet           |");
                        System.out.println("|3 | Laptop           |");
                        System.out.println("<--------------------->");
                        System.out.print("Input (1 / 2 / 3) : ");
                        String PilihJenis = inputUser.nextLine();

                        switch (PilihJenis) {
                            case "1":
                                elektronik1 = new Smartphone();
                                elektronik2 = new Smartphone();
                                while2 = false;
                                break;
                            case "2":
                                elektronik1 = new Tablet();
                                elektronik2 = new Tablet();
                                while2 = false;
                                break;
                            case "3":
                                elektronik1 = new Laptop();
                                elektronik2 = new Laptop();
                                while2 = false;
                                break;                        
                            default:
                                System.out.println("Input tidak valid..!");
                                break;
                        }
                        
                    }
                    System.out.println("<-----Input data----->");
                    Boolean whl1 = true;
                    while (whl1) {
                        System.out.print("Input Merk 1: ");
                        String merk1 = inputUser.nextLine();
                        Boolean cek1 = false;
                        for (Gadget data1 : listObj) {
                            if (data1.merk.equalsIgnoreCase(merk1)) {
                                cek1 = true;
                                break;
                            }
                        }
                        if (!cek1) {
                            System.out.print("Input Model 1: ");
                            String model1 = inputUser.nextLine();
                            elektronik1.setMerk(merk1);
                            elektronik1.setModel(model1);
                            listObj.add(elektronik1);
                            whl1 = false;
                        } else {
                            System.out.println("Merk sudah ada");
                        }
                    }
                    Boolean whl2 = true;
                    while (whl2) {
                        System.out.print("Input Merk 2: ");
                        String merk2 = inputUser.nextLine();
                        Boolean cek2 = false;
                        for (Gadget data2 : listObj) {
                            if (data2.merk.equalsIgnoreCase(merk2)) {
                                cek2 = true;
                                break;
                            }
                        }
                        if (!cek2) {
                            System.out.print("Input Model 2: ");
                            String model2 = inputUser.nextLine();
                            elektronik2.setMerk(merk2);
                            elektronik2.setModel(model2);
                            listObj.add(elektronik2);
                            whl2 = false;
                        } else {
                            System.out.println("Merk sudah ada");
                        }
                    }

                case "2" :
                    if (listObj.isEmpty()) {
                        System.out.println("Tidak ada Gadget untuk ditampilkan.");
                    } else {
                        System.out.println("<-------Daftar Gadget------->");
                        int nomer = 0;
                        for (Gadget data : listObj) {
                            nomer++;
                            System.out.println(nomer + ". Jenis Gadget  : " + data.jenisGadget);
                            System.out.println("   Merk          : " + data.merk);
                            System.out.println("   Model         : " + data.model);
                            System.out.println("-----------------------------");
                        }
                        System.out.println("<--------------------------->");
                    }
                    System.out.println();
                    break;
                case "3" :
                    if (listObj.isEmpty()) {
                        System.out.println("Tidak ada Gadget untuk dipilih.");
                    } else{
                        System.out.println("<-------Daftar Gadget------->");
                        int nomer = 0;
                        for (Gadget data : listObj) {
                            nomer++;
                            System.out.println(nomer + ". Jenis Gadget  : " + data.jenisGadget);
                            System.out.println("   Merk          : " + data.merk);
                            System.out.println("   Model         : " + data.model);
                            System.out.println("---------------------------");
                        }
                    
                        System.out.print("Pilih Gadget yang akan digunakan : ");
                        int pilihObj = inputUser.nextInt();
                        inputUser.nextLine();   
                        if (pilihObj > 0 && pilihObj <= listObj.size()) {
                            Gadget dari = listObj.get(pilihObj-1);
                            boolean while4 = true;
                            while (while4) {
                                System.out.println("<--------Pilih---------->");
                                System.out.println("|1 | Ambil Foto         |");
                                System.out.println("|2 | Rekam Video        |");
                                System.out.println("|3 | Kirim File         |");
                                System.out.println("|4 | Cari Jaringan      |");
                                System.out.println("|5 | Hubungkan Jaringan |");
                                System.out.println("|6 | Lupakan Jaringan   |");
                                System.out.println("|7 | Ambil  Koordinat   |");
                                System.out.println("|8 | keluar             |");
                                System.out.println("<----------------------->");
                                System.out.print("Pilih (1 / 2  / 3 / 4 / 5 / 6 / 7 / 8) : ");
                                String PilihFitur = inputUser.nextLine();
                                switch (PilihFitur) {
                                    case "1":
                                        dari.ambilFoto();
                                        while4 = false;
                                        break;
                                    case "2":
                                        dari.rekamVideo();
                                        while4 = false;
                                        break;
                                    case "3":
                                        nomer = 0;
                                        System.out.println("<-------Daftar Gadget------->");
                                        for (Gadget data : listObj) {
                                            nomer++;
                                            if (dari != data) {     
                                                System.out.println(nomer + ". Jenis Gadget  : " + data.jenisGadget);
                                                System.out.println("   Merk          : " + data.merk);
                                                System.out.println("   Model         : " + data.model);
                                                System.out.println("---------------------------");
                                            }
                                        }
                                        System.out.print("Kirim file ke:");
                                        int pilihKirimFile = inputUser.nextInt();
                                        inputUser.nextLine();
                                        if (pilihKirimFile > 0 && pilihKirimFile <= listObj.size()) {
                                            Gadget ke = listObj.get(pilihKirimFile-1);
                                            dari.kirimFile(ke);
                                            ke.terimaFile(dari);
                                        }
                                        while4 = false;
                                        break;
                                    case "4":
                                        dari.cariJaringan();
                                        while4 = false;
                                        break;
                                    case "5":
                                        dari.hubungkanJaringan();
                                        while4 = false;
                                        break;
                                    case "6":
                                        dari.lupakanJaringan();
                                        while4 = false;
                                        break;
                                    case "7":
                                        dari.ambilKoordinat();
                                        while4 = false;
                                        break;
                                    case "8":
                                        while4 = false;
                                        break;
                                    default:
                                        System.out.println("Input tidak valid..!");
                                        break;
                                }

                            }
                        } else {
                            System.out.println("Input tidak valid..!");
                        }
                    }
                    System.out.println();
                    break;

                case "4" :
                    if (listObj.isEmpty()) {
                        System.out.println("Tidak ada Gadget untuk dihapus.");
                    } else{
                        System.out.println("<-------Daftar Gadget------->");
                        int nomer = 0;
                        for (Gadget data : listObj) {
                            nomer++;
                            System.out.println(nomer + ". Jenis Gadget  : " + data.jenisGadget);
                            System.out.println("   Merk          : " + data.merk);
                            System.out.println("   Model         : " + data.model);
                            System.out.println("---------------------------");
                        }                     
                        boolean while4 = true;
                        while (while4) {
                            System.out.print("Pilih Gadget yang akan dihapus : ");
                            int hapus = inputUser.nextInt();
                            inputUser.nextLine();
                            if (hapus > 0 && hapus <= listObj.size()) {
                                listObj.remove(hapus - 1);
                                System.out.println("Berhasil menghapus data...");
                                System.out.println();
                                while4 = false;
                            } else {
                                System.out.println("Input tidak valid..!");
                            }
                        }
                    }
                    break;
                case "5" :
                    if (listObj.isEmpty()) {
                        System.out.println("Tidak ada Gadget untuk diedit.");
                    } else {
                        System.out.println("<-------Daftar Gadget------->");
                            int nomer = 0;
                            for (Gadget data : listObj) {
                                nomer++;
                                System.out.println(nomer + ". Jenis Gadget  : " + data.jenisGadget);
                                System.out.println("   Merk          : " + data.merk);
                                System.out.println("   Model         : " + data.model);
                                System.out.println("---------------------------");
                        }
                        boolean while4 = true;
                        while (while4) {
                            System.out.print("Pilih Gadget yang akan digunakan : ");
                            int pilihObj = inputUser.nextInt();
                            inputUser.nextLine();
                            if (pilihObj > 0 && pilihObj <= listObj.size()) {
                                Gadget pilih = listObj.get(pilihObj -1);
                                System.out.println(pilihObj);
                                System.out.println("<------Edit data----->");
                                System.out.print("Input Merk : ");
                                String merkEdit = inputUser.nextLine();
                                System.out.print("Input Model : ");
                                String modelEdit = inputUser.nextLine();
                                pilih.setMerk(merkEdit);
                                pilih.setModel(modelEdit);
                                System.out.println("Berhasil mengedit data...");
                                while4 = false;
                            } else {
                                System.out.println("Input tidak valid..!");
                            }
                        }
                    }
                    break;
                case "6" :
                    System.out.println("Program selesai...");
                    while1 = false;
                    break;
                default:
                    System.out.println("Input tidak valid..!");
                    break;

            }
        }
    }
}
