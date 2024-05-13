package Mobil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        Mobil mobil = null;
        String nama,model;
        int Tahun;
        while(true){
            System.out.println("1. Mobil MPV");
            System.out.println("2. Mobil SUV");
            System.out.println("3. Mobil Sport");
            System.out.println("4. Mobil Listrik");
            System.out.println("5. keluar");
            System.out.print("Silahkan Pilih Jenis Mobil :");
            int pilihan = Input.nextInt();
            Input.nextLine();

            if (pilihan == 1){
                System.out.print("Masukan Merek Mobil Anda :");
                nama = Input.nextLine();
                System.out.print("Masukan Model Mobil Anda :");
                model = Input.nextLine();
                System.out.print("Masukan Tahun Mobil Anda :");
                Tahun = Input.nextInt();
                mobil = new MPV(nama, model, Tahun);
                MPV mpv = new MPV(nama,model,Tahun);
                mpv.showfeature();
             } else if (pilihan == 2){
                System.out.print("Masukan Merek Mobil Anda :");
                nama = Input.nextLine();
                System.out.print("Masukan Model Mobil Anda :");
                model = Input.nextLine();
                System.out.print("Masukan Tahun Mobil Anda :");
                Tahun = Input.nextInt();
                mobil = new SUV(nama, model, Tahun);
                SUV suv = new SUV(nama,model,Tahun);
                suv.showfeature();
              } else if (pilihan == 3){
                System.out.print("Masukan Merek Mobil Anda :");
                nama = Input.nextLine();
                System.out.print("Masukan Model Mobil Anda :");
                model = Input.nextLine();
                System.out.print("Masukan Tahun Mobil Anda :");
                Tahun = Input.nextInt();
                System.out.print("Maukan Jarak Tempuh:");
                mobil = new Sport(nama, model, Tahun);
                Sport sport = new Sport(nama,model,Tahun);
                sport.showfeature();
              } else if (pilihan == 4){
                System.out.print("Masukan Merek Mobil Anda :");
                nama = Input.nextLine();
                System.out.print("Masukan Model Mobil Anda :");
                model = Input.nextLine();
                System.out.print("Masukan Tahun Mobil Anda :");
                Tahun = Input.nextInt();
                mobil = new Listrik(nama, model, Tahun);
                Listrik listrik = new Listrik(nama,model,Tahun);
                listrik.showfeature();
              }else if (pilihan == 5){
                System.out.println("Terima Kasih");
                System.exit(pilihan);
                Input.close();
              }else {
                System.out.println("Pilihan Tidak Tersedia");
                continue;
              }
              if (mobil != null){
                mobil.info();
                mobil.showfeature(mobil.merek);
              }
        }
    }
}