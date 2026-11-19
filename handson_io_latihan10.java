import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class Produk<T, U> {
    private T nama;
    private U harga;
    private Integer stok;

    public Produk(T nama, U harga, Integer stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}

public class handson_io_latihan10 {
    public static void main(String[] args) {

        // Membuat daftar produk
        List<Produk<String, Double>> produkList = new ArrayList<>();

        produkList.add(new Produk<>("Laptop", 15000000.0, 10));
        produkList.add(new Produk<>("Mouse", 150000.0, 25));
        produkList.add(new Produk<>("Keyboard", 350000.0, 15));

        Path filePath = Paths.get("produk_output.txt");

        try {
            // Menyimpan data produk ke file
            List<String> lines = new ArrayList<>();

            for (Produk<String, Double> p : produkList) {
                lines.add(p.toString());
            }

            Files.write(filePath, lines);

            System.out.println("Data produk berhasil disimpan menggunakan NIO.2");

            // Membaca kembali isi file
            List<String> data = Files.readAllLines(filePath);

            System.out.println("\nData Produk dari File:");

            for (String line : data) {
                System.out.println(line);
            }

            // Contoh penggunaan Generic untuk jenis data lain
            Produk<String, String> pelanggan =
                    new Produk<>("Andi", "Makassar", 0);

            Produk<Integer, Double> transaksi =
                    new Produk<>(101, 500000.0, 0);

            System.out.println("\nContoh Data Lain:");
            System.out.println("Pelanggan: " + pelanggan);
            System.out.println("Transaksi: " + transaksi);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
