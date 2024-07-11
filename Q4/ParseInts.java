package Q4;

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter a line of text:\n");
        String line = scan.nextLine();
        Scanner scanLine = new Scanner(line);

        while (scanLine.hasNext()) {
            try {
                int val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Ignoring non-integer values
            }
        }
        scanLine.close();

        System.out.println("The sum of the integers on this line is " + sum);
        scan.close();
    }
}