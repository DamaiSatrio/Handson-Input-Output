class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void showTypes() {
        System.out.println(first.getClass().getSimpleName() + " & " +
                           second.getClass().getSimpleName());
    }

    public void swap() {
        System.out.println("Sebelum swap: " + first + " & " + second);

        Object temp = first;
        first = (T1) second;
        second = (T2) temp;

        System.out.println("Sesudah swap: " + first + " & " + second);
    }
}

public class handson_io_latihan4 {
    public static void main(String[] args) {

        // Pair Integer dan String
        Pair<Integer, String> pair1 = new Pair<>(100, "Java");

        System.out.println("Pair 1:");
        pair1.showTypes();
        pair1.swap();

        System.out.println("-------------------------");

        // Pair Double dan Boolean
        Pair<Double, Boolean> pair2 = new Pair<>(10.5, true);

        System.out.println("Pair 2:");
        pair2.showTypes();
        pair2.swap();
    }
}
