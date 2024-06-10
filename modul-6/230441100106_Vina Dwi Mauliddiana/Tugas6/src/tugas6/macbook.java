/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;



public class macbook extends gadget {

    private String sistemOperasi;
    private String ram;
    private String penyimpanan;
    private String layar;
    private String prosesor;
    private String baterai;

    public macbook(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi Macbook:");
        System.out.println("Merk: " + getMerk());
        System.out.println("Model: " + getModel());
        System.out.println("Fitur:");
        System.out.println("- Sistem Operasi: " + sistemOperasi);
        System.out.println("- RAM: " + ram);
        System.out.println("- Penyimpanan: " + penyimpanan);
        System.out.println("- Layar: " + layar);
        System.out.println("- Prosesor: " + prosesor);
        System.out.println("- Baterai: " + baterai);
        System.out.println();
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setPenyimpanan(String penyimpanan) {
        this.penyimpanan = penyimpanan;
    }

    public void setLayar(String layar) {
        this.layar = layar;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }

    public void setBaterai(String baterai) {
        this.baterai = baterai;
    }
}

