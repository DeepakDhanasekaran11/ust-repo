
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 80000, 5);
        Employee e2 = new Developer("Bob", 102, 60000, "Java");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();

        }
    }
