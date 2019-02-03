package Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

@FunctionalInterface
public interface Checker<T> {
    boolean check(T object);
}

class B {
    public static void main(String[] args) {
        Checker<Integer> isOddAnonymous = o -> {
            if (o % 2 == 0) return false;
            else return true;
        };

        UnaryOperator<Integer> square = x -> x * x;
        Supplier<String> someString = () -> "some return value";
        BiConsumer<Integer, Long> multiplier = (Integer x, Long y) -> System.out.println(x * y);
        Function<Integer, Long> multiline = x -> {
            if (x != null && x % 2 == 0) {
                return (long) x * x;
            } else {
                return 123L;
            }
        };

        IntSupplier sample = new IntSupplier() {
            @Override
            public int getAsInt() {
                return 0;
            }
        };


        System.out.println(isOddAnonymous.check(123));
        System.out.println(isOddAnonymous.check(124));


    }
}


