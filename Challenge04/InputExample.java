import java.util.Scanner;

public class Challenge04_InputExample {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge() {
        String name;
        int age; // in years

        System.out.print("Name? ");
        name = scanner.next();

        System.out.print("Age? ");
        age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " springs young");

        scanner.close(); // optional, but good practice
    }

    public static void main(String[] args) {
        new Challenge04_InputExample().readNameAndAge();
    }
}
