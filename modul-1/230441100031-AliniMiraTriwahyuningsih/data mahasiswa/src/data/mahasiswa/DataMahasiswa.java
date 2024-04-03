package data.mahasiswa;

public class DataMahasiswa {
    

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String NAMA;
        String NIM;
        String JURUSAN;
        String FAKULTAS;
        
        System.out.println("INPUT NAMA= ");
        NAMA=input.nextLine();
        System.out.println("INPUT NIM=");
        NIM=input.nextLine();
        System.out.println("INPUT JURUSAN=");
        JURUSAN=input.nextLine();
        System.out.println("INPUT FAKULTAS=");
        FAKULTAS=input.nextLine();
        
        System.out.println("-----------");
        System.out.println("NAMA = " + NAMA);
        System.out.println("NIM = " + NIM);
        System.out.println("JURUSAN = " + JURUSAN);
        System.out.println("FAKULTAS = " + FAKULTAS);
    }
    
}

