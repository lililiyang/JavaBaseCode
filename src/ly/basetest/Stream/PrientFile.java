package ly.basetest.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 测试一百万条输出日志文件有多大
 * 60多Mb,有点恐怖,以后不能在死循环中输出日志文件
 */
public class PrientFile {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("D:\\文件\\1.txt");
            String value = "127.0.0.1 - - [25/Mar/2019:09:30:57 +0800] \"GET / HTTP/1.1\" 200 11418";
            for (int i = 0; i < 1000000; i++) {
                outputStream.write(value.getBytes());
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
