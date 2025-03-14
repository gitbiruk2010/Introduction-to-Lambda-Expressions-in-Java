// task 5: advanced Usage - Function composition & custom interfaces
import java.util.function.Function;

@FunctionalInterface
interface StringOperation {
    String apply(String s1, String s2);
}

public class Task5 {
    public static void main(String[] args) {
        // compose functions: add 1 then multiply by 10
        Function<Integer, Integer> addThenMultiply = ((Function<Integer, Integer>)(x -> x + 1))
                .andThen(x -> x * 10);
        System.out.println("Result: " + addThenMultiply.apply(4)); // expected outcome 50

        // custom interface: glue strings together & pick the longer one!
        StringOperation concat = (s1, s2) -> s1 + s2;
        StringOperation longer = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;

        System.out.println("Concat: " + concat.apply("Hello", "Ziegler")); // hellowziegler
        System.out.println("Longer: " + longer.apply("Hi", "Ziegler")); // ziegler
    }
}