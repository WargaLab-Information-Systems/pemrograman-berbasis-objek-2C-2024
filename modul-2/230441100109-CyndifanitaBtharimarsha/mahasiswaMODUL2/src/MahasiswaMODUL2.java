/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class MahasiswaMODUL2 {

        private String Nama, NIM, Jurusan, Alamat;
    
    //Konstruktor
    public MahasiswaMODUL2(String Nama, String NIMM, String Jurusann, String Alamatt){
        //konstruktor ini menerima 4 parameter
       this.Nama = Nama;
       NIM = NIMM;
        this.Jurusan = Jurusann;
        this.Alamat = Alamatt;
    }
    
    //ada empat getter
    //getter untuk mengambil nilai
    public String getNama(){
        return Nama;
    }
    
    public String getNIM(){
        return NIM;
    }
    
    public String getJurusan(){
        return Jurusan;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    //Setter
    //setter untuk mengubah nilai
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
       
    public static void main(String[] args) {
        MahasiswaMODUL2 mhs = new MahasiswaMODUL2("Fanita", "230441100109", "Sistem Informasi", "bojonegoro");
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNIM());
        System.out.println("Jurusan: " + mhs.getJurusan());
        System.out.println("Alamat: " + mhs.getAlamat());
    }
    
}
       
    
    
