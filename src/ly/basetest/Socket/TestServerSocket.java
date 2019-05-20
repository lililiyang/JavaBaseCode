package ly.basetest.Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liyang
 */
public class TestServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(6666);

        while(true){
            Socket ss = s.accept();
            System.out.println("A Client Connected!");
            DataInputStream dis = new DataInputStream(ss.getInputStream());
            String dist = dis.readUTF();
            System.out.println(dist);
        }

    }
}
