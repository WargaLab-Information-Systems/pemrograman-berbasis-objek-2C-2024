/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elektronik;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;      
        while (ulang) {
            System.out.println("\nPilih Jenis barang elektronik");
            System.out.println("1. Smartphone");
            System.out.println("2. Laptop");
            System.out.println("3. Tablet");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = input.nextInt();
            input.nextLine();  // Membersihkan buffer newline setelah nextInt()
            System.out.print("Masukkan Merk 1  : ");
            String merk = input.nextLine();
            System.out.print("Masukkan Merk 2  : ");
            String merk2 = input.nextLine();
            System.out.print("Masukkan Model 1 : ");
            String model = input.nextLine();
            System.out.print("Masukkan Model 2 : ");
            String model2 = input.nextLine();
            gadget Gadget = null;
            if (pilihan == 1) {
                while (true) {
                    System.out.println("\nMenu Informasi Spesifikasi");
                    System.out.println("1. Kamera");
                    System.out.println("2. Gps");
                    System.out.println("3. Bluetooth");
                    System.out.println("4. Wifi");
                    System.out.println("5. Kembali ke Menu Utama");
                    System.out.print("Masukkan Pilihan Spesifikasi Yang Ingin Anda Cek: ");
                    int pilihanSpesifikasi = input.nextInt();
                    input.nextLine();
                    if (pilihanSpesifikasi == 1) {
                        Gadget = new smartphone(merk, model);
                        Gadget.Display();
                        Gadget.ambilFoto();
                        Gadget.rekamVideo();
                        smartphone Gadget2 = new smartphone( merk2, model2);
                        Gadget2.Display();
                        Gadget2.ambilFoto();
                        Gadget2.rekamVideo();
                    } else if (pilihanSpesifikasi == 2) {
                        Gadget = new smartphone(merk, model);
                        Gadget.Display();
                        Gadget.ambilKoordinat();
                        smartphone Gadget2 = new smartphone(merk2, model2);
                        Gadget2.Display();
                        Gadget2.ambilKoordinat();
                    } else if (pilihanSpesifikasi == 3) {
                        Gadget = new smartphone(merk, model);
                        Gadget.Display();
                        Gadget.kirimFile();
                        Gadget.terimaFile();
                        Gadget.konekPerangkat();
                        smartphone Gadget2 = new smartphone( merk2, model2);
                        Gadget2.Display();
                        Gadget2.kirimFile();
                        Gadget2.terimaFile();
                        Gadget2.konekPerangkat();
                    } else if (pilihanSpesifikasi == 4) {
                        Gadget = new smartphone(merk, model);
                        Gadget.Display();
                        Gadget.carijaringan();
                        Gadget.hubungkanjaringan();
                        Gadget.lupakanjaringan();
                        smartphone Gadget2 = new smartphone( merk2, model2);
                        Gadget2.Display();
                        Gadget2.carijaringan();
                        Gadget2.hubungkanjaringan();
                        Gadget2.lupakanjaringan();
                    } else if (pilihanSpesifikasi == 5) {
                        break; // Kembali ke Menu Utama
                    } else {
                        System.out.println("Pilihan spesifikasi tidak valid.");
                    }
                }
            } else if (pilihan == 2) {
                while (true) {
                    System.out.println("\nMenu Informasi Spesifikasi");
                    System.out.println("1. Kamera");
                    System.out.println("2. Gps");
                    System.out.println("3. Bluetooth");
                    System.out.println("4. Wifi");
                    System.out.println("5. Kembali ke Menu Utama");
                    System.out.print("Masukkan Pilihan Spesifikasi Yang Ingin Anda Cek : ");
                    int pilihanSpesifikasi = input.nextInt();
                    input.nextLine();
                    if (pilihanSpesifikasi == 1) {
                        Gadget = new laptop(merk, model);
                        Gadget.Display();
                        Gadget.ambilFoto();
                        Gadget.rekamVideo(); 
                        Gadget.rekamVideo();
                        laptop Gadget2 = new laptop(merk2, model2);
                        Gadget2.Display();
                        Gadget2.ambilFoto();
                        Gadget2.rekamVideo(); 
                        Gadget2.rekamVideo();
                    } else if (pilihanSpesifikasi == 2) {
                        Gadget = new laptop(merk, model);
                        Gadget.Display();
                        Gadget.ambilKoordinat();
                        laptop Gadget2 = new laptop(merk2, model2);
                        Gadget2.Display();
                        Gadget.ambilKoordinat();
                    } else if (pilihanSpesifikasi == 3) {
                        Gadget = new laptop(merk, model);
                        Gadget.Display();
                        Gadget.kirimFile();
                        Gadget.terimaFile();
                        Gadget.konekPerangkat();
                        laptop Gadget2 = new laptop(merk, model);
                        Gadget2.Display();
                        Gadget2.kirimFile();
                        Gadget2.terimaFile();
                        Gadget2.konekPerangkat();
                    } else if (pilihanSpesifikasi == 4) {
                        Gadget = new laptop(merk, model);
                        Gadget.Display();
                        Gadget.carijaringan();
                        Gadget.hubungkanjaringan();
                        Gadget.lupakanjaringan();
                        laptop Gadget2 = new laptop(merk2, model2);
                        Gadget2.Display();
                        Gadget2.carijaringan();
                        Gadget2.hubungkanjaringan();
                        Gadget2.lupakanjaringan();
                    } else if (pilihanSpesifikasi == 5) {
                        break; // Kembali ke Menu Utama
                    } else {
                        System.out.println("Pilihan spesifikasi tidak valid.");
                    }
                }
            } else if (pilihan == 3) {
                while (true) {
                    System.out.println("\nMenu Informasi Spesifikasi");
                    System.out.println("1. Kamera");
                    System.out.println("2. Gps");
                    System.out.println("3. Bluetooth");
                    System.out.println("4. Wifi");
                    System.out.println("5. Kembali ke Menu Utama");
                    System.out.print("Masukkan Pilihan Spesifikasi Yang Ingin Anda Cek : ");
                    int pilihanSpesifikasi = input.nextInt();
                    input.nextLine();
                    if (pilihanSpesifikasi == 1) {
                        Gadget = new tablet(merk, model);
                        Gadget.Display();
                        Gadget.ambilFoto();
                        Gadget.rekamVideo();
                        tablet Gadget2 = new tablet(merk2, model2);
                        Gadget2.Display();
                        Gadget2.ambilFoto();
                        Gadget2.rekamVideo();
                    } else if (pilihanSpesifikasi == 2) {
                        Gadget = new tablet(merk, model);
                        Gadget.Display();
                        Gadget.ambilKoordinat();
                        tablet Gadget2 = new tablet(merk2, model2);
                        Gadget2.Display();
                        Gadget2.ambilKoordinat();
                    } else if (pilihanSpesifikasi == 3) {
                        Gadget = new tablet(merk, model);
                        Gadget.Display();
                        Gadget.kirimFile();
                        Gadget.terimaFile();
                        Gadget.konekPerangkat();
                        tablet Gadget2 = new tablet(merk2, model2);
                        Gadget2.Display();
                        Gadget2.kirimFile();
                        Gadget2.terimaFile();
                        Gadget2.konekPerangkat();
                    } else if (pilihanSpesifikasi == 4) {
                        Gadget = new tablet(merk, model);
                        Gadget.Display();
                        Gadget.carijaringan();
                        Gadget.hubungkanjaringan();
                        Gadget.lupakanjaringan();
                        tablet Gadget2 = new tablet(merk2, model2);
                        Gadget2.Display();
                        Gadget2.carijaringan();
                        Gadget2.hubungkanjaringan();
                        Gadget2.lupakanjaringan();
                    } else if (pilihanSpesifikasi == 5) {
                        break; // Kembali ke Menu Utama
                    } else {
                        System.out.println("Pilihan spesifikasi tidak valid.");
                    }
                }
            } else {
                System.out.println("\ninputan anda salah!");
            }
            System.out.print("\nMau input lagi tidak? (y / t) ");
            String tanya = input.nextLine();
            if (tanya.equalsIgnoreCase("t")) {
                System.out.println("Program Selesai...");
                ulang = false;
            } else if (!tanya.equalsIgnoreCase("y")) {
                System.out.println("Input tidak valid..!");
            }
        }
        input.close();
    }
}