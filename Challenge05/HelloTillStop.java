import java.util.*;

public class Challenge05_HelloTillStop {
    Scanner sc = new Scanner(System.in);

    // Outputs Hello while user wants to
    void showHello() {
        String choice; // guard variable
        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next(); // set guard variable

        while ("h".equals(choice)) { // check guard
            System.out.println("Hello");
            choice = sc.next(); // update guard variable
        }

        sc.close(); // good practice to close Scanner
    }

    public static void main(String[] args) {
        new Challenge05_HelloTillStop().showHello();
    }
}
