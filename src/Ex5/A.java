package Ex5;

interface I {
    public Integer m(String s, I i);
}
public class A implements I {
    @Override
    public Integer m(String s, I i) {
        return Integer.parseInt(s)+i.m("2", i); // 1
    }
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m("1", a::m)); // 2
    }
}