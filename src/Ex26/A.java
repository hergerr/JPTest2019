package Ex26;

import javax.net.SocketFactory;
import java.io.IOException;
import java.net.*;

public class A {
    static SocketFactory sf = SocketFactory.getDefault(); // 1

    public static void setFactory() throws IOException {
        Socket.setSocketImplFactory((SocketImplFactory) sf); // 2
        ServerSocket.setSocketFactory((SocketImplFactory) sf); // 3
    }
}