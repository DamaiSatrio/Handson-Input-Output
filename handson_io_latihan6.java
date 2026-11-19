import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class handson_io_latihan6 {
    public static void main(String[] args) {

        Path path = Paths.get("employees.txt");
        ArrayList<String> employees = new ArrayList<>();

        // Memeriksa keberadaan file
        if (!Files.exists(path)) {
            System.out.println("File employees.txt tidak ditemukan.");
            return;
        }

        // Membaca file
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

            String line;

            while ((line = br.readLine()) != null) {
                employees.add(line);
            }

            // Menampilkan daftar karyawan
            System.out.println("Daftar Karyawan:");
            for (String employee : employees) {
                System.out.println(employee);
            }

            // Menyalin data ke file baru
            Path copyPath = Paths.get("copy_employees.txt");
            Files.write(copyPath, employees, StandardCharsets.UTF_8);

            System.out.println("Data berhasil disalin ke copy_employees.txt.");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
