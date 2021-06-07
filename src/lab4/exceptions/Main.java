package lab4.exceptions;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.calculate(4);

        c.calculate(0);

        System.out.println("result ="+c.calculate(0));
    }
}
