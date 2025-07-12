import java.util.Arrays;

public class ClearArrayExample {
    public static void main(String[] args) {
        // Create an array of pallet IDs
        String[] pallets = { "B14", "A11", "B12", "A13" };

        System.out.println(); // Just prints a blank line for spacing

        // Print the first element in lowercase before clearing
        System.out.println("Before: " + pallets[0].toLowerCase());

        // Clear (set to null) the first two elements in the array (indices 0 and 1)
        Arrays.fill(pallets, 0, 2, null);

        // Check and print the first element after clearing
        if (pallets[0] != null) {
            System.out.println("After: " + pallets[0].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        // Show how many items are in the array and print each element
        System.out.println("Clearing 2 ... count: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }
    }
}