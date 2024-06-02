// package Gadget;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         Gadget gadget = null;
//         Gadget gdgt = null;
//         // while (true) {
//         //     System.out.println("Menu Informasi Spesifikasi Gadget");
//         //     System.out.println("1. Smartphone");
//         //     System.out.println("2. Tablet");
//         //     System.out.println("3. Laptop");
//         //     System.out.println("4. Keluar");
//         //     System.out.print("Masukan Pilihan Anda :");
//         //     int Pilihan = input.nextInt();
//         //     while (true) {
//         //         switch (Pilihan) {
//         //             case 1:
//         System.out.print("Masukan Merk Smartphone Anda :");
//         String Merek = input.nextLine();
//         System.out.print("Masukan Model Smartphone Anda :");
//         String Model = input.nextLine();
//         System.out.print("Masukan Merk Smartphone Kedua Anda :");
//         Model = input.nextLine();
//         System.out.print("Masukan Model Smartphone Kedua Anda :");
//         Model = input.nextLine();
//         System.out.print("Masukan Merk Tablet Anda :");
//         Merek = input.nextLine();
//         System.out.print("Masukan Model Tablet Anda :");
//         Model = input.nextLine();
//         System.out.print("Masukan Merk Tablet Kedua  Anda :");
//         Merek = input.nextLine();
//         System.out.print("Masukan Model Tablet Kedua Anda :");
//         Model = input.nextLine();
//         System.out.print("Masukan Merk laptop Anda :");
//         Merek = input.nextLine();
//         System.out.print("Masukan Model laptop Anda :");
//         Model = input.nextLine();
//         System.out.print("Masukan Merk laptop kedua Anda :");
//         Merek = input.nextLine();
//         System.out.print("Masukan Model laptop Kedua Anda :");
//         Model = input.nextLine();
//                         gadget = new Smartphone();
//                         gdgt= new Smartphone();
//                         gadget = new Laptop();
//                         gdgt = new Laptop();
//                         gadget = new Tablet();
//                         gdgt = new Tablet();
//                         System.out.println();
//                         System.out.println("Gadget Pertama");
//                             gadget.Model(Merek, Model);
//                             gadget.Merk(Merek, Model);
//                             gadget.AmbilFoto(Merek, Model);
//                             gadget.AmbilVideo(Merek, Model); 
//                             gadget.AmbilKordinat(Merek, Model);
//                             gadget.KirimFile(Merek, Model);
//                             gadget.TerimaFile(Merek, Model);
//                             gadget.KoneksiPerangkat(Merek, Model);
//                             gadget.CariJaringan(Merek, Model);
//                             gadget.HubungkanJaringan(Merek, Model);
//                             gadget.LupkanJaringan(Merek, Model);
//                         System.out.println();
//                         System.out.println("Gadget Kedua");
//                             gdgt.Model(Merek, Model);
//                             gdgt.Merk(Merek, Model);
//                             gdgt.AmbilFoto(Merek, Model);
//                             gdgt.AmbilVideo(Merek, Model); 
//                             gdgt.AmbilKordinat(Merek, Model);
//                             gdgt.KirimFile(Merek, Model);
//                             gdgt.TerimaFile(Merek, Model);
//                             gdgt.KoneksiPerangkat(Merek, Model);
//                             gdgt.CariJaringan(Merek, Model);
//                             gdgt.HubungkanJaringan(Merek, Model);
//                             gdgt.LupkanJaringan(Merek, Model);

//                     // // case 2:
//                     //     System.out.println();

//                     //     System.out.println();
//                     //     System.out.println("Tablet Pertama");
//                     //         tblt.Model(Merk, Model);
//                     //         tblt.Merk(Merk, Model);
//                     //         tblt.AmbilFoto(Merk, Model);
//                     //         tblt.AmbilVideo(Merk, Model); 
//                     //         tblt.AmbilKordinat(Merk, Model);
//                     //         tblt.KirimFile(Merk, Model);
//                     //         tblt.TerimaFile(Merk, Model);
//                     //         tblt.KoneksiPerangkat(Merk, Model);
//                     //         tblt.CariJaringan(Merk, Model);
//                     //         tblt.HubungkanJaringan(Merk, Model);
//                     //         tblt.LupkanJaringan(Merk, Model);
//                     //         System.out.println();
//                     //         System.out.println("Tablet Kedua");
//                     //         tablet.Model(Merkk, Modell);
//                     //         tablet.Merk(Merkk, Modell);
//                     //         tablet.AmbilFoto(Merkk, Modell);
//                     //         tablet.AmbilVideo(Merkk, Modell); 
//                     //         tablet.AmbilKordinat(Merkk, Modell);
//                     //         tablet.KirimFile(Merkk, Modell);
//                     //         tablet.TerimaFile(Merkk, Modell);
//                     //         tablet.KoneksiPerangkat(Merkk, Modell);
//                     //         tablet.CariJaringan(Merkk, Modell);
//                     //         tablet.HubungkanJaringan(Merkk, Modell);
//                     //         tablet.LupkanJaringan(Merkk, Modell);
//                     // // case 3:
//                     //     System.out.println();

//                     //     System.out.println();
//                     //     System.out.println("laptop Pertama");
//                     //         lpt.Model(Merek, Modeel);
//                     //         lpt.Merk(Merek, Modeel);
//                     //         lpt.AmbilFoto(Merek, Modeel);
//                     //         lpt.AmbilVideo(Merek, Modeel); 
//                     //         lpt.AmbilKordinat(Merek, Modeel);
//                     //         lpt.KirimFile(Merek, Modeel);
//                     //         lpt.TerimaFile(Merek, Modeel);
//                     //         lpt.KoneksiPerangkat(Merek, Modeel);
//                     //         lpt.CariJaringan(Merek, Modeel);
//                     //         lpt.HubungkanJaringan(Merek, Modeel);
//                     //         lpt.LupkanJaringan(Merek, Modeel);
//                     //         System.out.println();
//                     //         System.out.println("laptop Kedua");
//                     //         laptop.Model(Mereek, Moodel);
//                     //         laptop.Merk(Mereek, Moodel);
//                     //         laptop.AmbilFoto(Mereek, Moodel);
//                     //         laptop.AmbilVideo(Mereek, Moodel); 
//                     //         laptop.AmbilKordinat(Mereek, Moodel);
//                     //         laptop.KirimFile(Mereek, Moodel);
//                     //         laptop.TerimaFile(Mereek, Moodel);
//                     //         laptop.KoneksiPerangkat(Mereek, Moodel);
//                     //         laptop.CariJaringan(Mereek, Moodel);
//                     //         laptop.HubungkanJaringan(Mereek, Moodel);
//                     //         laptop.LupkanJaringan(Mereek, Moodel);
//                     // case 4:
//                     //     System.out.println("Terima Kasih Telah Menggunakan Program Ini");
//                     //     System.exit(0);
//                     // default:
//                     // System.out.println("Pilihan Tida Tersedia");
//                     // continue;
//             //     }
                
//             // }
//         }
       
//     }
// // }

// // package Gadget;
// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner input = new Scanner(System.in);
// //         Gadget gadget = null;
// //         while (true) {
// //             System.out.println("Menu Informasi Spesifikasi Gadget");
// //             System.out.println("1. Smartphone");
// //             System.out.println("2. Tablet");
// //             System.out.println("3. Laptop");
// //             System.out.println("4. Keluar");
// //             System.out.print("Masukan Pilihan Anda :");
// //             int Pilihan = input.nextInt();
// //             input.nextLine(); // Konsumsi newline

// //             if (Pilihan == 4) {
// //                 System.out.println("Keluar dari program...");
// //                 break; // Keluar dari loop utama
// //             }

// //             boolean validGadgetChoice = true;
// //             switch (Pilihan) {
// //                 case 1:
// //                     gadget = new Smartphone();
// //                     break;
// //                 case 2:
// //                     gadget = new Tablet();
// //                     break;
// //                 case 3:
// //                     gadget = new Laptop();
// //                     break;
// //                 default:
// //                     System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
// //                     validGadgetChoice = false; // Tandai pilihan tidak valid
// //             }

// //             if (!validGadgetChoice) {
// //                 continue; // Kembali ke awal loop utama untuk meminta input lagi
// //             }

// //             boolean validSpecChoice = false;
// //             while (!validSpecChoice) {
// //                 System.out.println("Menu Informasi Spesifikasi");
// //                 System.out.println("1. Kamera");
// //                 System.out.println("2. Gps");
// //                 System.out.println("3. Bluetooth");
// //                 System.out.println("4. Wifi");
// //                 System.out.print("Masukan Pilihan Spesifikasi Yang Ingin Anda Cek :");
// //                 int specChoice = input.nextInt();
// //                 input.nextLine(); // Konsumsi newline

// //                 System.out.print("Masukan Merk Gadget Anda :");
// //                 String Merk = input.nextLine();
// //                 System.out.print("Masukan Model Gadget Anda :");
// //                 String Model = input.nextLine();

// //                 gadget.Model(Merk, Model);
// //                 gadget.Merk(Merk, Model);

// //                 switch (specChoice) {
// //                     case 1:
// //                         gadget.AmbilFoto(Merk, Model);
// //                         gadget.AmbilVideo(Merk, Model);
// //                         validSpecChoice = true; // Pilihan valid
// //                         break;
// //                     case 2:
// //                         gadget.AmbilKordinat(Merk, Model);
// //                         validSpecChoice = true; // Pilihan valid
// //                         break;
// //                     case 3:
// //                         gadget.KirimFile(Merk, Model);
// //                         gadget.TerimaFile(Merk, Model);
// //                         gadget.KoneksiPerangkat(Merk, Model);
// //                         validSpecChoice = true; // Pilihan valid
// //                         break;
// //                     case 4:
// //                         gadget.CariJaringan(Merk, Model);
// //                         gadget.HubungkanJaringan(Merk, Model);
// //                         gadget.LupkanJaringan(Merk, Model);
// //                         validSpecChoice = true; // Pilihan valid
// //                         break;
// //                     default:
// //                         System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
// //                         // Tetap di dalam loop spesifikasi untuk meminta input lagi
// //                 }
// //             }
// //         }
// //     }
// // }
