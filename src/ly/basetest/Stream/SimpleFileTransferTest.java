package ly.basetest.Stream;

import java.io.*;

/**
 * 普通io和nio
 */
public class SimpleFileTransferTest {

    public static long transferFile(File source,File des) throws IOException {
        long startTime = System.currentTimeMillis();
        if(!des.exists()){
            des.createNewFile();
        }
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(des));

        byte[] bytes = new byte[1024 * 1024];
        int len;
        while((len = inputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        long stopTime = System.currentTimeMillis();

        return stopTime-startTime;
    }

   /* public static long transferFileWithNIO(File source,File des) throws IOException {

    }*/

    public static void main(String[] args) throws IOException {
        File source = new File("E:\\SSM\\乐优商城\\Day57 - 商品表结构\\1_Ap4JZ.mp4");
        File des = new File("E:\\SSM\\乐优商城\\Day57 - 商品表结构\\2222.avi");
        long time = transferFile(source, des);
        System.out.println("普通字节流:"+time);
    }
}
