import java.io.*;
import java.util.*;

public class Main {
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);
    private static ArrayList<Pestisida> dataPestisida = new ArrayList<>();

  private static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        while (true) {
            clear();
            System.out.println("===== Sistem Pendataan Pestisida di PT Sinar Mas =====");
            System.out.println("1. Tambah Data Pestisida");
            System.out.println("2. Lihat Data Pestisida");
            System.out.println("3. Ubah Data Pestisida");
            System.out.println("4. Hapus Data Pestisida");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    clear();
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(0);
                default:
                    clear();
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }

    private static void tambahData() throws IOException {
        clear();
        System.out.println("===== Tambah Data Pestisida =====");
        System.out.print("Nama Pestisida: ");
        String nama = input.readLine();

        // Pilihan jenis pestisida
        clear();
        System.out.println("Pilih Jenis Pestisida:");
        System.out.println("1. Insektisida");
        System.out.println("2. Fungisida");
        System.out.println("3. Bakterisida");
        System.out.println("4. Nermatisida");
        System.out.println("5. Akarisida");
        System.out.println("6. Rodenstisida");
        System.out.println("7. Moluskisida");
        System.out.println("8. Herbisida");
        System.out.println("9. Ovisida");
        System.out.println("10. Piscisida");
        System.out.println("11. Termisida");
        System.out.print("Pilihan: ");
        int jenisChoice = Integer.parseInt(input.readLine());
        String jenis = "";
        switch (jenisChoice) {
            case 1:
                jenis = "Insektisida";
                break;
            case 2:
                jenis = "Fungisida";
                break;
            case 3:
                jenis = "Bakterisida";
                break;
            case 4:
                jenis = "Nermatisida";
                break;
            case 5:
                jenis = "Akarisida";
                break;
            case 6:
                jenis = "Rodenstisida";
                break;
            case 7:
                jenis = "Moluskisida";
                break;
            case 8:
                jenis = "Herbisida";
                break;
            case 9:
                jenis = "Ovisida";
                break;
            case 10:
                jenis = "Piscisida";
                break;
            case 11:
                jenis = "Termisida";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        // Pilihan bentuk fisik
        clear();
        System.out.println("Pilih Bentuk Fisik:");
        System.out.println("1. Padat");
        System.out.println("2. Cair");
        System.out.println("3. Aerosol");
        System.out.print("Pilihan: ");
        int bentukFisikChoice = Integer.parseInt(input.readLine());
        String bentukFisik = "";
        switch (bentukFisikChoice) {
            case 1:
                bentukFisik = "Padat";
                break;
            case 2:
                bentukFisik = "Cair";
                break;
            case 3:
                bentukFisik = "Aerosol";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        // Pilihan golongan pestisida
        clear();
        System.out.println("Pilih Golongan:");
        System.out.println("1. Sintetik Anorganik");
        System.out.println("2. Organik Organo khlorin");
        System.out.println("3. Heterosiklik");
        System.out.println("4. Karbamat");
        System.out.print("Pilihan: ");
        int golonganChoice = Integer.parseInt(input.readLine());
        String golongan = "";
        switch (golonganChoice) {
            case 1:
                golongan = "Sintetik Anorganik";
                break;
            case 2:
                golongan = "Organik Organo khlorin";
                break;
            case 3:
                golongan = "Heterosiklik";
                break;
            case 4:
                golongan = "Karbamat";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        Pestisida pestisida = new Pestisida(nama, jenis, bentukFisik, golongan);
        dataPestisida.add(pestisida);
        clear();
        System.out.println("Data pestisida berhasil ditambahkan.");
        System.out.print("Tekan enter untuk kembali ke menu utama...");
        input.readLine();
    }
    
    private static void ubahData() throws IOException {
        clear();
        System.out.println("===== Ubah Data Pestisida =====");
        lihatData1();
        System.out.print("Masukkan nomor data yang ingin diubah: ");
        int index = Integer.parseInt(input.readLine()) - 1;
    
        if (index < 0 || index >= dataPestisida.size()) {
            System.out.println("Nomor data tidak valid.");
            System.out.print("Tekan enter untuk kembali ke menu utama...");
            input.readLine();
            return;
        }
    
        clear();
        Pestisida pestisida = dataPestisida.get(index);
        System.out.println("Masukkan data baru:");
    
        System.out.print("Nama Pestisida: ");
        pestisida.setNama(input.readLine());

        clear();
        // Pilihan jenis pestisida
        System.out.println("Pilih Jenis Pestisida:");
        System.out.println("1. Insektisida");
        System.out.println("2. Fungisida");
        System.out.println("3. Bakterisida");
        System.out.println("4. Nermatisida");
        System.out.println("5. Akarisida");
        System.out.println("6. Rodenstisida");
        System.out.println("7. Moluskisida");
        System.out.println("8. Herbisida");
        System.out.println("9. Ovisida");
        System.out.println("10. Piscisida");
        System.out.println("11. Termisida");
        System.out.print("Pilihan: ");
        int jenisChoice = Integer.parseInt(input.readLine());
        String jenis = "";
        switch (jenisChoice) {
            case 1:
                jenis = "Insektisida";
                break;
            case 2:
                jenis = "Fungisida";
                break;
            case 3:
                jenis = "Bakterisida";
                break;
            case 4:
                jenis = "Nermatisida";
                break;
            case 5:
                jenis = "Akarisida";
                break;
            case 6:
                jenis = "Rodenstisida";
                break;
            case 7:
                jenis = "Moluskisida";
                break;
            case 8:
                jenis = "Herbisida";
                break;
            case 9:
                jenis = "Ovisida";
                break;
            case 10:
                jenis = "Piscisida";
                break;
            case 11:
                jenis = "Termisida";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        clear();
        // Pilihan bentuk fisik
        pestisida.setJenis(jenis);
        System.out.print("Pilih Bentuk Fisik:");
        System.out.println("1. Padat");
        System.out.println("2. Cair");
        System.out.println("3. Aerosol");
        System.out.print("Pilihan: ");
        int bentukFisikChoice = Integer.parseInt(input.readLine());
        String bentukFisik = "";
        switch (bentukFisikChoice) {
            case 1:
                bentukFisik = "Padat";
                break;
            case 2:
                bentukFisik = "Cair";
                break;
            case 3:
                bentukFisik = "Aerosol";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        clear();    
        // Pilihan golongan pestisida
        pestisida.setBentukFisik(bentukFisik);
        System.out.println("Pilih Golongan:");
        System.out.println("1. Sintetik Anorganik");
        System.out.println("2. Organik Organo khlorin");
        System.out.println("3. Heterosiklik");
        System.out.println("4. Karbamat");
        System.out.print("Pilihan: ");
        int golonganChoice = Integer.parseInt(input.readLine());
        String golongan = "";
        switch (golonganChoice) {
            case 1:
                golongan = "Sintetik Anorganik";
                break;
            case 2:
                golongan = "Organik Organo khlorin";
                break;
            case 3:
                golongan = "Heterosiklik";
                break;
            case 4:
                golongan = "Karbamat";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        pestisida.setGolongan(golongan);
        clear();
        System.out.println("Data pestisida berhasil diubah.");
        System.out.print("Tekan enter untuk kembali ke menu utama...");
        input.readLine();
    }    
    
    private static void lihatData() throws IOException {
        clear();
        System.out.println("===== Data Pestisida =====");
        for (int i = 0; i < dataPestisida.size(); i++) {
            Pestisida pestisida = dataPestisida.get(i);
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama: " + pestisida.getNama());
            System.out.println("Jenis: " + pestisida.getJenis());
            System.out.println("Bentuk Fisik: " + pestisida.getBentukFisik());
            System.out.println("Golongan: " + pestisida.getGolongan());
            System.out.println();
        }
        System.out.print("Tekan enter untuk kembali ke menu utama...");
        input.readLine();
    }
    private static void lihatData1() throws IOException {
        clear();
        System.out.println("===== Data Pestisida =====");
        for (int i = 0; i < dataPestisida.size(); i++) {
            Pestisida pestisida = dataPestisida.get(i);
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama: " + pestisida.getNama());
            System.out.println("Jenis: " + pestisida.getJenis());
            System.out.println("Bentuk Fisik: " + pestisida.getBentukFisik());
            System.out.println("Golongan: " + pestisida.getGolongan());
            System.out.println();
        }
    }

    private static void hapusData() throws IOException {
        System.out.println("===== Hapus Data Pestisida =====");
        lihatData1();
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int index = Integer.parseInt(input.readLine()) - 1;
        clear();
        if (index < 0 || index >= dataPestisida.size()) {
            System.out.println("Nomor data tidak valid.");
            System.out.print("Tekan enter untuk kembali ke menu utama...");
            input.readLine();
            return;
        }
        clear();
        dataPestisida.remove(index);
        System.out.println("Data pestisida berhasil dihapus.");
        System.out.print("Tekan enter untuk kembali ke menu utama...");
        input.readLine();
    }

   
}

