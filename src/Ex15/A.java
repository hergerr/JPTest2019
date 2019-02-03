package Ex15;

class E1 extends Exception {}
class E2 extends E1 {} // 1
class B extends A {
    public void m() throws E2 {}; // 2
}
public class A {
    public void m() throws E1 {} // 3
}