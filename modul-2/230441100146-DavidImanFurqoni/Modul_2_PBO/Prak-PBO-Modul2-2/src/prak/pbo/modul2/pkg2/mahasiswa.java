package prak.pbo.modul2.pkg2;

public class mahasiswa{
    String nama;
    String nim;
    String prodi;
    String alamat;
    static String univ;
    String ukm []=new String[4];
 
    public mahasiswa (String nama, String nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;          
    }
    public void setNama(String nama){
            this.nama = nama;
        }
        public String getNama(){
            return nama;
        }
        public void setNim(String nim){
            this.nim = nim;
        }
        public String getNim(){
            return nim;
        }
        public void setProdi(String prodi){
            this.prodi = prodi;
        }
        public String getProdi(){
            return prodi;
        }
        public void setAlamat(String alamat){
            this.alamat = alamat;
        }
        public String getAlamat(){
            return alamat;
        }
        public static void setUniv(String namaUniv){
            univ = namaUniv;
        }
        public static String getUniv(){
            return univ;
        }
        public void tambahUkm(String namaUkm) {
//            tambahUkm(namaUkm);
        }      
        public void tampilUkm(){
            System.out.println("UKM yang diikuti oleh "+ nama + ":");
            for (String namaUkm : ukm){
                System.out.println("-"+ namaUkm);
            }
        }
        public static void main(String[] args){
            mahasiswa.setUniv("Universitas Airlangga");
            mahasiswa maha = new mahasiswa("Darus", "230441100300", "Pendidikan Informatika", "Pamekasan");
          
            maha.tambahUkm("Kesenian");
            maha.tambahUkm("olahraga");
          
            System.out.println("nama : "+maha.getNama());
            System.out.println("nim : "+maha.getNim());
            System.out.println("prodi : "+maha.getProdi());
            System.out.println("alamat : "+maha.getAlamat());
            System.out.println("universitas : "+mahasiswa.getUniv());
            maha.ukm[0]="kesenian";
            maha.ukm[1]="musik";
            maha.ukm[2]="pecinta alam";
            maha.ukm[3]="oke";
            System.out.println("UKM : "+maha.ukm[0]);
            System.out.println("UKM : "+maha.ukm[1]);
            System.out.println("UKM : "+maha.ukm[2]);
            System.out.println("UKM : "+maha.ukm[3]);
    }     
}
