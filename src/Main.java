import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] validSymbols = {"+", "-", "*", "/"};
        boolean isValid = false;
        for (String validSymbol : validSymbols) {
            if (validSymbol.equals(args[0])) {
                isValid = true;
            }
        }

        if (!isValid) {
            System.out.println("Bad arg");
            System.exit(-1);
        }

        double n = scan.nextInt();
        double e = scan.nextInt();

        switch (args[0]) {
            case "+":
                System.out.println(n + e);
                break;

            case "-":
                System.out.println(n - e);
                break;

            case "*":
                System.out.println(n * e);
                break;
            case "÷":
                System.out.println(n / e);
                break;
        }
    }
}
