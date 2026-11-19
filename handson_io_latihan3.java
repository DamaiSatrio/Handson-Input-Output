class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        System.out.println("Tipe: " + data.getClass().getSimpleName());
    }
}

public class handson_io_latihan3 {
    public static void main(String[] args) {

        Cell<Integer> cellInteger = new Cell<>();
        cellInteger.setValue(10);
        cellInteger.displayType();

        Cell<String> cellString = new Cell<>();
        cellString.setValue("Java");
        cellString.displayType();
    }
}
