package Ex7;

interface I {
    public static int n(String s) {
        return s.length();
    }
}

interface J {
    public static int n(String s) {
        return s.indexOf("1");
    }
}

public class A{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.<I>m("012")); // 1
        System.out.println(a.<J>m("012")); // 2
    }

    public <T> int m(String s) {
        T t;
//        return T.n(s); // 3
        return 1;
    }
}
