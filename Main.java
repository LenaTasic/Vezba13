import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double operand1 = Integer.parseInt(sc.nextLine());

        System.out.println("Unesite zeljenu racunsku operaciju: ");
        String operator = sc.nextLine();

        System.out.println("Unesite drugi broj: ");
        double operand2 = Integer.parseInt(sc.nextLine());

        switch (operator) {
            case "*":
                System.out.println("Rezultat je: " + (operand1 * operand2));
                break;
            case "/":
                System.out.println("Rezultat je: " + (operand1 / operand2));
                break;
            case "+":
                System.out.println("Rezultat je: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Rezultat je: " + (operand1 - operand2));
                break;
        }
    }
}
