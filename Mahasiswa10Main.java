import java.util.Scanner;

public class Mahasiswa10Main {
    public static void main(String[] args) {
        int[] daftarNilai = {10, 5, 20, 15, 5, 45};
        Sorting10.sequentialSearch(daftarNilai, 5);
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int jumMhs;

        System.out.println("---------------------------------------------------------");
        System.out.print("Masukkan berapa banyak data yang ingin ditambahkan : ");
        jumMhs = s.nextInt();

        PencarianMhs data = new PencarianMhs(jumMhs);
        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil");
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("---------------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa10 m = new Mahasiswa10(nim, nama, umur, ipk);
            data.tambah(m);
        }

            System.out.println("---------------------------------------------------------");
            System.out.println("Data keseluruhan mahasiswa : ");
            data.tampil();

            System.out.println("_________________________________________________________");
            System.out.println("_________________________________________________________");
            System.out.println("Pencarian data : ");
            System.out.print("Masukkan nama mahasiswa yang dicari : ");
            String cari = s.next();

            // System.out.print("NIM : ");
            // int cari = s.nextInt();
            // System.out.println("=========================================================");
            // System.out.println("Menggunakan sequential search");
            // int posisi = data.FindSeqSearch(cari);

            // data.TampilPosisi(cari, posisi);
            // data.TampilData(cari, posisi);

            System.out.println("=========================================================");
            System.out.println("Menggunakan binary search");

            data.countSearchName(cari);
            int posisi = data.FindBinarySearchByName(cari, 0, jumMhs - 1, 0);
            data.TampilposisiNama(cari, posisi);
            data.TampilDataNama (cari, posisi);

            // posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
            // data.TampilPosisi(cari, posisi);
            // data.TampilData(cari, posisi);
    }
}