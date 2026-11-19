enum AccountType {
    SAVINGS("SA", 0.03),
    CREDIT("CR", 0.05);

    private final String code;
    private final double interestRate;

    AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

public class handson_io_latihan2 {
    public static void main(String[] args) {

        // Menampilkan seluruh informasi tipe akun
        for (AccountType type : AccountType.values()) {
            System.out.println("Nama: " + type.name());
            System.out.println("Kode: " + type.getCode());
            System.out.println("Interest Rate: " + type.getInterestRate());
            System.out.println("--------------------");
        }
    }
}
