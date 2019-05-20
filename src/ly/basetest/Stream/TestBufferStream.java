package ly.basetest.Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferStream {
    public static void main(String[] args) {
        try {
            FileInputStream  fis = new FileInputStream("D:\\文件\\WeChat Files\\wxid_n9lc4d238i4u22\\Files\\1.txt") ;
            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            bis.mark(100);
            int c = 0;
            for(int i = 0;i<10&&(c=bis.read())!=-1;i++){
                System.out.print((char)c);
            }
            System.out.println();
            bis.reset();
            for(int i = 0;i<10&&(c=bis.read())!=-1;i++){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
