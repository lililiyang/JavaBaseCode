package ly.basetest.Stream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * @author liyang
 */
public class TestPrintStream {
    public static void main(String[] args) {
        try {
            OutputStream out = new FileOutputStream("D:\\test.txt");
            PrintStream ps = new PrintStream(out);
            System.setOut(ps);
            for (int c=0;c<600;c++){
                System.out.print(c+"\t");
                //把世界各国的文字打印到log.txt这个文件中去
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
