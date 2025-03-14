// task 1: understanding Lambda Expressions
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // a list of names to print
        List<String> names = Arrays.asList("Ziegler", "Michael", "Janet", "Jeremy");

        // runnable using lambda
        Runnable printNames = () -> {
            for (String name : names) {
                System.out.println(name);
            }
        };

        // running the thread
        new Thread(printNames).start();
    }
}