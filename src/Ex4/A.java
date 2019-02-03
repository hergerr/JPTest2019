package Ex4;


//statyczna metoda w interfejsie
public class A implements I {
//    @Override
    public void m() {
        System.out.println("A::m");
//        I.m1();
    }
    public static void main(String[] args) {
//        new A().m1();
    }
}
