import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class handson_io_latihan7 {
    public static void main(String[] args) {

        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path log = Paths.get("log.txt");

        try {
            // Menulis laporan ke file
            Files.write(source, List.of(
                "Report Generated",
                "Status: OK"
            ));

            System.out.println("Laporan berhasil dibuat.");

            // Memeriksa keberadaan file sebelum menyalin
            if (Files.exists(source)) {

                // Membuat folder backup jika belum tersedia
                if (Files.notExists(backup.getParent())) {
                    Files.createDirectories(backup.getParent());
                }

                // Menyalin file laporan
                Files.copy(source, backup,
                    StandardCopyOption.REPLACE_EXISTING);

                System.out.println("Backup berhasil dibuat.");

                // Mencatat hasil operasi ke log
                Files.writeString(log,
                    "Laporan berhasil dibuat.\n" +
                    "Backup berhasil dibuat.\n");

            } else {
                System.out.println("File laporan tidak ditemukan.");

                Files.writeString(log,
                    "Gagal: File laporan tidak ditemukan.\n");
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
