package kendaraan;
public class kendaraan {
    String jenis; 
    String merk; 
    String model; 
    String status; 
    int tahunKendaraan;
    
    public kendaraan(String jenis, String merk, String model, String status, int tahunKendaraan){
        this.jenis=jenis;
        this.merk=merk;
        this.model=model;
        this.status=status;
        this.tahunKendaraan=tahunKendaraan;
    }
    
    @Override
    public String toString(){
        if (status.equalsIgnoreCase("T")) {
                status = "Tersedia";
            } else if (status.equalsIgnoreCase("D")) {
                status = "Disewakan";
            } else {
                System.out.println("Inputkan (T) untuk kendaraan yang tersedia atau (D) untuk kendaraan yang disewakan  ");
            }
        
        return "Jenis Kendaraan : "+jenis+
                "\nmerk : "+merk +
                "\nmodel : "+model+
                "\nstatus kemdaraan : "+status+
                "\ntahun kendaraan : "+tahunKendaraan;
    }
}
