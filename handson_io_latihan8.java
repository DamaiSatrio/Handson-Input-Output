import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class handson_io_latihan8 {
    public static void main(String[] args) {

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = Files.newBufferedWriter(
                 Paths.get("user_input.txt"))) {

            System.out.println("Masukkan teks (ketik exit untuk berhenti):");

            while (true) {
                System.out.print("Input: ");
                String text = sc.nextLine();

                if (text.equalsIgnoreCase("exit")) {
                    break;
                }

                String timestamp =
                    LocalDateTime.now().format(formatter);

                bw.write("[" + timestamp + "] " + text);
                bw.newLine();
            }

            System.out.println("Data berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
