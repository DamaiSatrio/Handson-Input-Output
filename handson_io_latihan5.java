public class handson_io_latihan5 {

    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }

    public static void main(String[] args) {

        System.out.println("Integer: " + isEqual(5, 5));

        System.out.println("String: " + isEqual("Hello", "World"));

        System.out.println("Double: " + isEqual(3.14, 3.14));

        System.out.println("Character: " + isEqual('A', 'B'));
    }
}
