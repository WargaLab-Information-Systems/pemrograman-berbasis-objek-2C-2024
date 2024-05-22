/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascoding;

class Pekerja {
     private int gaji;
     private String nama;
    
    public Pekerja(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
   
    public void tampilkanInformasi() {
        System.out.println("Nama \t: " + getNama());
        System.out.println("Gaji \t: " + getGaji());
    }
}

class Mekanik extends Pekerja {
    private String keahlian;

    public Mekanik(String nama, int gaji, String keahlian) {
        super(nama, gaji);
        this.keahlian = keahlian;
    }
    
    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    
    
    @Override
    public void tampilkanInformasi(){
        super.tampilkanInformasi();
        System.out.println("Keahlian \t: " + getKeahlian());
    }
}

class Guru extends Pekerja {
    private String mengajar;

    public Guru(String nama, int gaji, String mengajar) {
        super(nama, gaji);
        this.mengajar = mengajar;
    }
    
    public String getMengajar() {
        return mengajar;
    }

    public void setMengajar(String mengajar) {
        this.mengajar = mengajar;
    }
    
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Mengajar \t: " + getMengajar());
    }
}

class Penyanyi extends Pekerja {
    private String genreMusik;

    public Penyanyi(String nama, int gaji, String genreMusik){
        super(nama, gaji);
        this.genreMusik = genreMusik;
    }
    
    public String getGenreMusik() {
        return genreMusik;
    }

    public void setGenreMusik(String genreMusik) {
        this.genreMusik = genreMusik;
    }
    
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Genre Musik \t: " + getGenreMusik());
    }
}

public class Main {
    public static void main(String[] args) {
        Mekanik budi = new Mekanik("Budi", 2000000, "Mesin");
        Guru vivi = new Guru("Vivi", 2500000, "Matematika");
        Penyanyi zee = new Penyanyi("Zee", 10000000, "JKT");
        
        budi.tampilkanInformasi();
        vivi.tampilkanInformasi();
        zee.tampilkanInformasi();
    }
}
