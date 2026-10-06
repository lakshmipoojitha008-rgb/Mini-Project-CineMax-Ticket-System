import java.util.Scanner;
class WeeklySales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sales = new int[3][4];
        System.out.println("Enter ticket sales for 3 movies and 4 days:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Movie " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                sales[i][j] = sc.nextInt();
                if (sales[i][j] < 0) {
                    System.out.println("Tickets cannot be negative.");
                    sales[i][j] = 0;
                }
            }
        }
        System.out.println("\nTicket Sales Table:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Movie " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
        int bestMovie = 0;
        int highestTotal = 0;
        System.out.println("\nTotal tickets of each movie:");
        for (int i = 0; i < 3; i++) {
            int rowTotal = 0;
            for (int j = 0; j < 4; j++) {
                rowTotal = rowTotal + sales[i][j];
            }
            System.out.println("Movie " + (i + 1) + ": " + rowTotal);
            if (rowTotal > highestTotal) {
                highestTotal = rowTotal;
                bestMovie = i;
            }
        }

        System.out.println("\nTotal tickets of each day:");
        for (int j = 0; j < 4; j++) {
            int columnTotal = 0;
            for (int i = 0; i < 3; i++) {
                columnTotal = columnTotal + sales[i][j];
            }
            System.out.println("Day " + (j + 1) + ": " + columnTotal);
        }
        System.out.println("\nBest Movie: Movie " + (bestMovie + 1));

        sc.close();
    }
}