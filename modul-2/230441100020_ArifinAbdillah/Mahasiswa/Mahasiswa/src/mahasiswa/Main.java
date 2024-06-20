public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Arifin Abdillah", "230441100020", "Sistem Informasi", "ITC");
        Mahasiswa.universitas = "UTM";
        mhs1.tampilData();
        System.out.println("<------------------------->");
        mhs1.setNama("akbar");
        System.out.println("Nama : " + mhs1.getNama());
        mhs1.setNim("230441100060");
        System.out.println("Nim : " + mhs1.getNim());
        mhs1.setProdi("mesin");
        System.out.println("Prodi : " + mhs1.getProdi());
        mhs1.setUkm("TOfatek");
        System.out.println("UKM : " + mhs1.getUkm());
        mhs1.setUniversitas("UI");
        System.out.println("Universitas : " + mhs1.getUniversitas());
        
    }
}
