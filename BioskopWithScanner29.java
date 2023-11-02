import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();
                int baris, kolom;
                boolean kursiTerisi = true;

                while (kursiTerisi) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi, silahkan isi kembali");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Berhasil.");
                        kursiTerisi = false;
                    }
                }
                System.out.println();
            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = penonton[i][j];
                        if (namaPenonton != null) {
                            System.out.printf("Baris %d, Kolom %d, Atas Nama: %s\n", i + 1, j + 1, namaPenonton);
                        }
                    }
                }
                System.out.println();
            } else if (pilihan == 3) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}
