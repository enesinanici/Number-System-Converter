import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("--- ENGINEERING CALCULATOR ---");
        System.out.println("1. Decimal -> Binary");
        System.out.println("2. Binary -> Decimal");
        System.out.println("3. Decimal -> Hexadecimal");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter decimal number: ");
                int dec = scanner.nextInt();
                System.out.println("Binary Result: " + converter.decimalToBinary(dec));
                break;
            case 2:
                System.out.print("Enter binary number: ");
                String bin = scanner.next();
                System.out.println("Decimal Result: " + converter.binaryToDecimal(bin));
                break;
            case 3:
                System.out.print("Enter decimal number: ");
                int dec2 = scanner.nextInt();
                System.out.println("Hex Result: 0x" + converter.decimalToHex(dec2));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
