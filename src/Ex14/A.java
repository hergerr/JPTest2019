package Ex14;

class E1 extends Exception {
}

class E2 extends Exception {
}

public class A {
    public static void m() throws Exception {// 1
        try {
            n();
        } catch (E1 | E2 e) {
//            e = new E1();
            throw e; // 2
        }
    }

    public static void n() throws E1, E2 {
    } // 3
}