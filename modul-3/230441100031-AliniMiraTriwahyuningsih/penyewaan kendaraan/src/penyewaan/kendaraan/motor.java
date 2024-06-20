
package penyewaan.kendaraan;

/**
 *
 * @author LENOVO V13 HENDRIK
 */
public class motor extends PenyewaanKendaraan {
    String type = "Beat";
    String fasilitas = "jok empuk, Ban Aman, Sudah di servis";

    public motor(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }
    @Override
    public void display(){
        super.display();
        System.out.println(" ");
        System.out.println("==INFORMASI MOTOR==");
        System.out.println("type :" + this.type);
        System.out.println("Penumpang :" + this.fasilitas);
}}
