
package penyewaan.kendaraan;

/**
 *
 * @author LENOVO V13 HENDRIK
 */
public class sepeda extends PenyewaanKendaraan{
    String type = "Ongkel";
    String fasilitas = "Ac";

    public sepeda(String jenis, String merek, String model, char status, int tahun) {
        super(jenis, merek, model, status, tahun);
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("sepeda bertype :" + type);
        System.out.println("sepeda bertype :" + fasilitas);
    }
    
}
