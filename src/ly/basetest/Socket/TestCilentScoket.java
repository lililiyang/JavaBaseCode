package ly.basetest.Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TestCilentScoket {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket s = new Socket("127.0.0.1",6666);

        OutputStream out = s.getOutputStream();
        DataOutputStream data = new DataOutputStream(out);
        Thread.sleep(30000);
        data.writeUTF("HEllo Server!");
    }
}
