import java.util.Scanner;

public class Hihi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        switch (args[0]) {
            case "c":
                String hihi = scan.nextLine();
                String[] validSymbols = {"+", "-", "*", "/"};
                boolean isValid = false;

                for (String validSymbol : validSymbols) {
                    if (validSymbol.equals(hihi)) {
                        isValid = true;
                    }
                }

                if (!isValid) {
                    System.out.println("Bad operation");
                    System.out.println("use + - * ÷");
                    System.exit(-1);
                }

                double n = scan.nextInt();
                double e = scan.nextInt();

                switch (hihi) {
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
                break;

            case "v":
                String text = scan.nextLine();
                char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
                char[] charText = text.toCharArray();
                int counter = 0;

                for (char symbol : charText) {
                    for (int i = 0; i < vowels.length; i++) {
                        if (symbol == vowels[i]) {
                            counter++;
                        }
                    }
                }

                System.out.println(counter);
                break;

            default:
                System.out.println("commands: c = calculator, v = vowel counter");
                break;
        }
    }
}
