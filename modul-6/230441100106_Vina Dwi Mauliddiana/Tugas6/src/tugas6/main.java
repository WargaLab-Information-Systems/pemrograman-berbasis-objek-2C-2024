/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;


import java.util.ArrayList; //penomeran
import java.util.List;
import java.util.Scanner;


public class main {
public static void main(String[] args) {
        // Input data gadget dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("**Program Data Gadget**");

        System.out.print("Berapa banyak gadget yang ingin Anda masukkan? ");
        int jumlahGadget = scanner.nextInt();

        List<gadget> daftarGadget = new ArrayList<>();
        // untuk menyeimpan objek kelas gadget atau subclass
        // arraylist menampung/menyimpan objek yang ada didalam gadget,gadget menururankan, menampung gadget lalu ditaruh di daftar gadget//
        //alur penggunaan arraylist menyimpan suatu objek kemudian dia akan menaruhnya didaftar objek tadi, kemudian ditampilkan

        for (int i = 0; i < jumlahGadget; i++) {
            //perulangan jika i kurang dari 1 maka akan bertambsh diinisialisasi ke 0
            System.out.println("\n**Gadget ke-" + (i + 1) + "**");
            //menghitung nomor gadget menambahkan 1 ke loop i 
            System.out.print("Masukkan merk gadget: ");
            String merk = scanner.next();

            System.out.print("Masukkan model gadget: ");
            String model = scanner.next();

            System.out.print("Jenis gadget (Handphone, tablet, macbook): ");
            String jenisGadget = scanner.next().toLowerCase();

            gadget gadget;
            switch (jenisGadget) {
                case "handphone":
                    gadget = new handphone(merk, model);
                    break;
                case "tablet":
                    gadget = new tablet (merk, model);
                    break;
                case "macbook":
                    gadget = new macbook(merk, model);
                    break;
                default:
                    System.out.println("Jenis gadget tidak valid. Lewati gadget ini.");
                    continue;
            }

            // Masukkan data spesifikasi tambahan untuk laptop
            if (gadget instanceof macbook) { //jika gadget memlih objek laptop maka, program ini yang akan jalan
                System.out.print("Masukkan sistem operasi: ");
                ((macbook) gadget).setSistemOperasi(scanner.next());

                System.out.print("Masukkan kapasitas RAM: ");
                ((macbook) gadget).setRam(scanner.next());

                System.out.print("Masukkan kapasitas penyimpanan: ");
                ((macbook) gadget).setPenyimpanan(scanner.next());

                System.out.print("Masukkan ukuran layar: ");
                ((macbook) gadget).setLayar(scanner.next());

                System.out.print("Masukkan jenis prosesor: ");
                ((macbook) gadget).setProsesor(scanner.next());

                System.out.print("Masukkan durasi baterai: ");
                ((macbook) gadget).setBaterai(scanner.next());
            }

            daftarGadget.add(gadget);
        }

        // Tampilkan data gadget
        System.out.println("\n**Daftar Gadget**");
        for (gadget gadget : daftarGadget) {
            gadget.tampilkanSpesifikasi();
            System.out.println();
        }
    }

}

 
