package Ex9;

class B {
    int i = 1;
}

class BB extends B {
    int ii = 2;
}

class BBB extends BB {
    int iii = 3;
}

class BBBB<T> extends BBB {
    T t;
    int iiii = 3;
}

public class A {
    public static void m(BBBB<? super BB> b) {
        System.out.println(b.i + b.ii);
    } // 1

    public static void main(String[] args) {
//        m(new BBBB<BBB>()); // 2
        m(new BBBB<B>()); // 3
    }
}