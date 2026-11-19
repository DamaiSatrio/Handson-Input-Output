enum AccountType {
    SAVINGS("SA", 0.03),
    CREDIT("CR", 0.05);

    private String code;
    private double interestRate;

    private AccountType(String code, double interestRate) {
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

        for (AccountType type : AccountType.values()) {
            System.out.println(
                "Nama: " + type.name() +
                ", Kode: " + type.getCode() +
                ", Bunga: " + type.getInterestRate()
            );
        }
    }
}
