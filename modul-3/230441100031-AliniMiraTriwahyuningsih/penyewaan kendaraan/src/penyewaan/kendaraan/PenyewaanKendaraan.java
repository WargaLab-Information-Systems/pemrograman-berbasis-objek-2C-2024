
package penyewaan.kendaraan;


public class PenyewaanKendaraan {
    String jenis, merek, model;
    char status;
    int tahun;
    
    PenyewaanKendaraan (String jenis, String merek, String model, char status, int tahun){
       this.jenis= jenis;
       this.merek= merek;
       this.model= model;
       this.status= status;
       this.tahun= tahun;
       
   }
          
    public void display() {
        System.out.println("Jenis :"  + jenis );
        System.out.println("Merek :"  + merek );
        System.out.println(" model :"  + model );
        System.out.print("Status :");
        if (status == 'T'){
            System.out.println("Tersedia");
        }
        else if (status == 'D'){
            System.out.println("Disewakan");
        }
        System.out.println("tahun :"  + tahun );
    }
    
    }
