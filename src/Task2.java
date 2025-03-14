// task 2: using Lambda Expressions with Functional Interfaces
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Task2 {
    public static void main(String[] args) {
        // perform operations
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero isn't allowed");
            }
            return a / b;
        };

        System.out.println("10 + 5 = " + add.operate(10, 5));
        System.out.println("10 - 5 = " + subtract.operate(10, 5));
        System.out.println("10 * 5 = " + multiply.operate(10, 5));
        try {
            System.out.println("10 / 5 = " + divide.operate(10, 5));
            System.out.println("10 / 0 = " + divide.operate(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}