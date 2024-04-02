package prak.pbo.modul2;
    class mahasiswa{
        String nama;
        String nim;
        String prodi;
        String alamat;
        
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
    }
public class PrakPBOModul2 {
    public static void main(String[] args) {
        mahasiswa maha = new mahasiswa("Darus", "230441100300", "Sistem Informasi", "Surabaya");        
        System.out.println("nama : " + maha.getNama());
        System.out.println("nim : "+ maha.getNim());
        System.out.println("prodi : "+maha.getProdi());
        System.out.println("alamat : "+maha.getAlamat());
        
        maha.setProdi("Akuntansi");
        
        System.out.println("Perubahan Prodi : ");
        System.out.println("nama : " + maha.getNama());
        System.out.println("nim : "+ maha.getNim());
        System.out.println("prodi : "+maha.getProdi());
        System.out.println("alamat : "+maha.getAlamat());
    }
}
