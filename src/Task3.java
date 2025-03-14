// task 3: using Lambda Expressions with Collections - Sort and filter
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        // sort names by length using lambda magic
        List<String> names = Arrays.asList("Ziegler", "Bona", "Joe", "Jeremy");
        names.sort((a, b) -> a.length() - b.length());
        System.out.println("Sorted by length: " + names);

        // filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }
}