import java.util.Scanner;

public class IPChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address to validate: ");
        String ipAddress = scanner.nextLine();
        scanner.close();

        if (isValidIP(ipAddress)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }

    public static boolean isValidIP(String ip) {
        // Split the IP into octets
        String[] octets = ip.split("\\.");

        // Check we have exactly 4 octets
        if (octets.length != 4) {
            return false;
        }

        try {
            // Check first octet (must not be 0 and must be multi-digit)
            if (octets[0].startsWith("0") || octets[0].length() == 1) {
                return false;
            }

            // Check all octets are numbers between 0-255
            for (String octet : octets) {
                int num = Integer.parseInt(octet);
                if (num < 0 || num > 255) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e) {
            return false; // if any octet isn't a number
        }
    }
}