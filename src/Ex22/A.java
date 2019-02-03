package Ex22;

import java.net.*;

public class A {
    public static String receive() throws Exception {
        DatagramSocket ds = new DatagramSocket(1024 + 1);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);
        ds.close();
        return new String(dp.getData(), 0, dp.getLength());
    }

    public static void main(String[] args) throws Exception {
        System.out.println(receive());
    }
}
