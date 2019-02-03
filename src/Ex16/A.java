package Ex16;

public abstract class A {// 1

    public static void main(String[] args) {
        A a = new B(); // 2
    }
}

class B extends A { // 3
}