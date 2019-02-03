package Test;

interface I{
    int m(int i);
}

public class A {
    void x(I i){
        System.out.println(i.m(7));
    }

    public static void main(String[] args) {
        A a = new A();
        a.x(y -> y*y);
        a.x(y -> y*y*y);
    }
}
