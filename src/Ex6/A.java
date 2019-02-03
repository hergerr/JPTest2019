package Ex6;

import java.util.function.BiFunction;

interface I {
    abstract public int m(String s, A a);
}
public class A {
    public void n1(I i) {
        System.out.println(i.m("A",this));
    }
    public void n2(BiFunction<String,A,Integer> i) {
        System.out.println(i.apply("A",this));
    }
    public static void main(String[] args) {
        A a = new A();
        a.n1( (x,y) -> {return 1;}); // 1
        a.n2( (x,y) -> {return 1;}); // 2
    }
}