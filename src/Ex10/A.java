package Ex10;

public class A {
    public static void m(B b1, B b2) {
//        b1.i + b2.i; // 1
    }

    public static void main(String[] args) {
        m(new B(), new A.B()); // 2
    }

    static class B { // 3
        int i;
    }
}
