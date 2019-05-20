package ly.basetest.Stream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TestTransform1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("D:\\data.txt"));
            out.write("MircosoftsunIBMOracleApplet");
            System.out.println(out.getEncoding());
            out.close();

            out = new OutputStreamWriter(new FileOutputStream("D:\\data.txt",true),"ISO8859_1");
            out.write("MircosoftsunIBMOracleApplet");
            System.out.println(out.getEncoding());
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
