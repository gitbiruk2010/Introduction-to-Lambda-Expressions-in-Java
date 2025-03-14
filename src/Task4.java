// task 4: Using Built-in Functional Interfaces
import java.util.function.Predicate;
import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        // check if string is empty using Predicate
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("Is the string empty? " + isEmpty.test("hi there"));

        // convert string to SHOUTING CASE using Function
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("Loud: " + toUpper.apply("AD300"));
    }
}