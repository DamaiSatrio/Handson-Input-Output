enum AccountType {
    SAVINGS("Akun Tabungan"),
    CREDIT("Akun Kredit"),
    DEPOSIT("Akun Deposito");

    private final String deskripsi;

    AccountType(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String toString() {
        return deskripsi;
    }
}

public class handson_io_latihan1 {
    public static void main(String[] args) {

        // Mencetak semua tipe enum
        for (AccountType tipe : AccountType.values()) {
            System.out.println(tipe.name() + " -> " + tipe);
        }
    }
}
