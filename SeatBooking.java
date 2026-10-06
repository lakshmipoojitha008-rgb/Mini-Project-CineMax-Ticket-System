import java.util.Scanner;
class SeatBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] seats = new int[2][3][4];
        System.out.println("CineMax Seat Booking");
        System.out.print("Enter screen number (1 or 2): ");
        int screen = sc.nextInt();
        System.out.print("Enter row number (1 to 3): ");
        int row = sc.nextInt();
        System.out.print("Enter seat number (1 to 4): ");
        int seat = sc.nextInt();
        if (screen < 1 || screen > 2 ||
            row < 1 || row > 3 ||
            seat < 1 || seat > 4) {
            System.out.println("Invalid screen, row or seat number.");
        } else {
            int s = screen - 1;
            int r = row - 1;
            int st = seat - 1;
            if (seats[s][r][st] == 1) {
                System.out.println("Seat already booked.");
            } else {
                seats[s][r][st] = 1;
                System.out.println("Seat booked successfully.");
            }
        }
        System.out.println("\nSeat Map:");
        for (int s = 0; s < 2; s++) {
            System.out.println("\nScreen " + (s + 1) + ":");
            for (int r = 0; r < 3; r++) {
                for (int st = 0; st < 4; st++) {
                    System.out.print(seats[s][r][st] + " ");
                }
                System.out.println();
            }
        }
        int freeSeats = 0;
        for (int s = 0; s < 2; s++) {
            for (int r = 0; r < 3; r++) {
                for (int st = 0; st < 4; st++) {
                    if (seats[s][r][st] == 0) {
                        freeSeats++;
                    }
                }
            }
        }
        System.out.println("\nTotal Free Seats: " + freeSeats);
        sc.close();
    }
}