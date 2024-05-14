/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

public class Constructor {
    static String univ ="Universitas Trunojoyo Madura";
    static String ukm;
    String nama;
    String jurusan;
    int NIM;
    String alamat;
    
    Constructor(String nama, String jurusan, int NIM, String alamat){
        this.nama = nama;
        this.jurusan = jurusan;
        this.NIM = NIM;
        this.alamat = alamat;
    
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public int getNIM(){
        return NIM;
    }
    public void setjurusan(String prodi){
        this.jurusan = prodi;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    static void staticuniv(){
        System.out.println("kuliah di :"+univ);
    }
    static void staticukm(){
        String[] ukm ={"ITC","SOKET","Nanggala"};
        System.out.println("ukm yang saya ikuti :");
        for (String namaukm: ukm){
        System.out.println(namaukm);
    }
}

    public static void main(String[] args) {
        Constructor cons =new Constructor("aqis","sistem informasi",123,"surabaya");
        
        System.out.println("nama :"+cons.nama);
        System.out.println("prodi :"+cons.jurusan);
        System.out.println("NIM :"+cons.NIM);
        System.out.println("alamat: "+cons.alamat);
        
        Constructor.staticuniv();
        Constructor.staticukm();
    }
    
}
