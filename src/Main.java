import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 5, 7};

        int result = Arrays.stream(array).sum();
        System.out.println(result);
    }
}