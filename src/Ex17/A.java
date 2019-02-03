package Ex17;

import java.io.ObjectOutputStream;
class E extends Exception {}
public class A {
    public static void main(String[] args) {
        try {
//            ObjectOutputStream o = new ObjectOutputStream("out.bin");
//            o.writeObject(new E());
        } catch (Exception e) {}
    }
}