package Ex3;

public interface I {
    public default Integer m1() {return 1;}
    public default int m2() {return 1;}
    public static Integer m3() { return Integer.parseInt("1");}
}
