import java.io.*;
import java.util.ArrayList;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class handson_io_latihan9 {

    // Method untuk menyimpan objek
    public static void serialize(ArrayList<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("emp.ser"))) {

            oos.writeObject(employees);
            System.out.println("Serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method untuk membaca kembali objek
    public static void deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("emp.ser"))) {

            ArrayList<Employee> employees =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("\nData setelah Deserialization:");

            for (Employee employee : employees) {
                employee.display();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Membuat beberapa objek Employee
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", 30));
        employees.add(new Employee("Andi", 25));
        employees.add(new Employee("Budi", 28));

        // Menyimpan objek
        serialize(employees);

        // Membaca kembali objek
        deserialize();
    }
}
