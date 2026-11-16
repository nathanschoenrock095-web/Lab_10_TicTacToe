import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

        } while (retString.length() == 0);

        return retString;
    }


    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear the newline
                valid = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid integer.");
            }

        } while (!valid);

        return value;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                valid = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!valid);

        return value;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Number must be between " + low + " and " + high);
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid integer.");
            }

        } while (!valid);

        return value;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Number must be between " + low + " and " + high);
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!valid);

        return value;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String answer = "";
        boolean valid = false;
        boolean result = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            answer = pipe.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                result = true;
                valid = true;
            } else if (answer.equalsIgnoreCase("N")) {
                result = false;
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }

        } while (!valid);

        return result;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String value = "";
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");
            value = pipe.nextLine();

            if (value.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }

        } while (!valid);

        return value;
    }

}



