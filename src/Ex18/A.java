package Ex18;

import java.util.Arrays;
import java.util.stream.IntStream;

public class A {
    public static void main(String[] args) {
        int tab[] = new int[]{0, 1, 2};
        IntStream.range(0, 5).
                forEach(x -> {
                    tab[x % 3] = x + 2 * x;
                });
        System.out.println(Arrays.toString(tab));
    }
}