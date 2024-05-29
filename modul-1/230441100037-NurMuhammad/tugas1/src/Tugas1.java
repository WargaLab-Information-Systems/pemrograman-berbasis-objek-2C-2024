public class Tugas1 {
    public static void main(String[] args) throws Exception {
        Manusia orang1 = new Manusia();
        orang1.nama = "Nur muhammad";
        orang1.umur = 19;
        orang1.alamat = "Karangduak Sumenep";
        orang1.tampilBiodata();
        orang1.berjalan();
        orang1.berlari();

        Manusia orang2 = new Manusia();
        orang2.nama = "Ari";
        orang2.umur = 19;
        orang2.alamat = "Karangduak Sumenep";
        orang2.tampilBiodata();
        orang2.berjalan();
        orang2.berlari();

        Manusia orang3 = new Manusia();
        orang3.nama = "Akbar";
        orang3.umur = 19;
        orang3.alamat = "Bluto Sumenep";
        orang3.tampilBiodata();
        orang3.berjalan();
        orang3.berlari();
    }
}
