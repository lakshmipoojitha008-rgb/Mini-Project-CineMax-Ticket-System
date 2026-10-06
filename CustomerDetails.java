import java.util.Scanner;
class CustomerDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        int length = name.length();
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        int vowels = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
                vowels++;
            }
        }
        boolean validPhone = true;
        if (phone.length() != 10) {
            validPhone = false;
        } else {
            for (int i = 0; i < phone.length(); i++) {

                char ch = phone.charAt(i);

                if (ch < '0' || ch > '9') {
                    validPhone = false;
                    break;
                }
            }
        }
        System.out.println("\nCustomer Details");
        System.out.println("Name: " + name);
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Reversed: " + reverse);
        System.out.println("Vowels: " + vowels);
        if (validPhone) {
            System.out.println("Phone: " + phone + " -> Valid");
        } else {
            System.out.println("Phone: " + phone + " -> Invalid");
        }
        if (validPhone) {
            String hiddenPhone =
                phone.substring(0, 2) +
                "XXXXXX" +
                phone.substring(8, 10);
            System.out.println("Ticket: " + name + ", " + hiddenPhone
            );
        } else {
            System.out.println("Ticket cannot be generated.");
        }
        sc.close();
    }
}