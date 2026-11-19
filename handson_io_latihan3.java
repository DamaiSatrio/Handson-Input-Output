class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        System.out.println("Tipe Data: " + data.getClass().getSimpleName());
    }
}

public class handson_io_latihan3 {
    public static void main(String[] args) {

        // Cell dengan tipe Integer
        Cell<Integer> cellInteger = new Cell<>();
        cellInteger.setValue(100);

        System.out.println("Nilai Integer: " + cellInteger.getValue());
        cellInteger.displayType();

        System.out.println("-------------------------");

        // Cell dengan tipe String
        Cell<String> cellString = new Cell<>();
        cellString.setValue("Belajar Java Generic");

        System.out.println("Nilai String: " + cellString.getValue());
        cellString.displayType();
    }
}
