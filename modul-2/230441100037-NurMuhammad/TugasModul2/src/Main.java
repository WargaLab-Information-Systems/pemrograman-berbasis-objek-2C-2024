import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner inputUser = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa("Nur muhammad", "230441100037", "Sumenep Madura" , "Sistem Informasi");
        Mahasiswa.universitas = "UTM";
        mhs1.tampilData();

        System.out.println("<------------------------->");

        while (true) {
            System.out.print("Masukkan Nama             : ");
            mhs1.setNama(inputUser.nextLine());
            System.out.print("Masukkan NIM              : ");
            mhs1.setNim(inputUser.nextLine());
            System.out.print("Masukkan Alamat           : ");
            mhs1.setAlamat(inputUser.nextLine());
            while (true) {
                System.out.println("41 = TEKNIK INFORMATIKA");
                System.out.println("42 = TEKNIK INDUSTRI");
                System.out.println("43 = TEKNIK ELEKTRO");
                System.out.println("44 = SISTEM INFORMASI");
                System.out.println("48 = TEKNIK MESIN");
                System.out.println("49 = TEKNIK MEKATRONIKA");
                System.out.print("Masukkan Angka Jurusan    : ");
                if (mhs1.cariProdi(inputUser.nextLine())) {
                    break;
                }
                System.out.println("nomer yang anda masukkan tidak ada");
            }
            System.out.print("Masukkan Universitas      : ");
            Mahasiswa.setUniversitas(inputUser.nextLine());
            System.out.print("Masukkan UKM Yang diikuti : ");
            mhs1.setUkm(inputUser.nextLine());
    
            System.out.println("Nama        : " + mhs1.getNama());
            System.out.println("Nim         : " + mhs1.getNim());
            System.out.println("Alamat         : " + mhs1.getAlamat());
            System.out.println("Prodi       : " + mhs1.getProdi());
            System.out.println("Universitas : " + Mahasiswa.getUniversitas());
            System.out.println("UKM       : ");
            mhs1.getUkm();

            String tanya;
            while (true) {
                System.out.print("Apakah Anda ingin memasukkan data lagi? (y/n):");
                tanya = inputUser.nextLine();
                if (tanya.equals("n")) {
                    break;
                } else if (tanya.equals("y")) {
                    break;
                } else {
                    System.out.println("masukkan input y atau n");
                }
            }
            if (tanya.equals("n")) {
                break;
            }
        }
    }
}
