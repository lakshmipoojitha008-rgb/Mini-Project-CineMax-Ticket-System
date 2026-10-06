import java.util.Scanner;
class Customers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] customers = new String[3][];
        customers[0] = new String[2];
        customers[1] = new String[4];
        customers[2] = new String[3];
        for (int i = 0; i < customers.length; i++) {
            System.out.println("\nEnter customers for Show " + (i + 1));
            for (int j = 0; j < customers[i].length; j++) {
                System.out.print("Customer " + (j + 1) + ": ");
                customers[i][j] = sc.next();
            }
        }
        System.out.println("\nCustomer Details:");
        for (int i = 0; i < customers.length; i++) {
            System.out.print("Show " + (i + 1) + ": ");
            for (int j = 0; j < customers[i].length; j++) {
                System.out.print(customers[i][j]);
                if (j < customers[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println("Number of customers: " + customers[i].length);
        }
        System.out.print("\nEnter name to search: ");
        String searchName = sc.next();
        boolean found = false;
        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < customers[i].length; j++) {
                if (customers[i][j].equalsIgnoreCase(searchName)) {
                    System.out.println(searchName + " found in Show " + (i + 1));
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println(searchName + " not found.");
        }
        sc.close();
    }
}