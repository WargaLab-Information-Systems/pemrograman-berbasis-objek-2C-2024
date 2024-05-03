package projectmanusia;

public class ProjectManusia {
    public static void main(String[] args) {
        // Membuat objek manusia dengan attribut nama, umur, alamat
        Manusia manusia = new Manusia();//membuat instance dari manusia class bernama manusia
        manusia.nama = "Mingyu";
        manusia.umur = 17;
        manusia.alamat = "Korea Selatan";
        
        // Menampilkan nama, umur, dan alamat
        System.out.println("Biodata :");
        System.out.println("Nama : "+manusia.nama);
        System.out.println("Umur : "+manusia.umur);
        System.out.println("Alamat : "+manusia.alamat);
        
        // Memanggil method berjalan dan berlari pada objek manusia
        manusia.berjalan("Di taman Melihat senja.");//memanggil berjalan method manusia objek dengan argumen
        manusia.berlari("Melewati jembatan.");
        manusia.kampus("Trunojoyo");

    }
}
