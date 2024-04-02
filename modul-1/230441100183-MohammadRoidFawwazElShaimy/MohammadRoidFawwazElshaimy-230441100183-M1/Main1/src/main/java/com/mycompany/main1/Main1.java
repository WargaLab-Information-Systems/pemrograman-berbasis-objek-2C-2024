
package com.mycompany.main1;

class manusia{
    String nama;
    int umur;
    String alamat;

    void berjalan(){
        System.out.println("berjalan");
    }
    
    void berlari(){
        System.out.println("berlari ke hutan");
    }
}
public class Main1 {

    public static void main(String[] args) {
        manusia manusia = new manusia();
        manusia.nama = "Budi";
        manusia.umur = 27;
        manusia.alamat = "Surabaya";
        
        System.out.println("nama saya = "+manusia.nama);
        System.out.println("umurku = "+manusia.umur);
        System.out.println("alamat = "+manusia.alamat);
        System.out.print(manusia.nama+" sedang ");
        manusia.berjalan();
        System.out.print(manusia.nama+" sedang ");
        manusia.berlari();
    }
}


