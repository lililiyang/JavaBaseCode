package ly.basetest.Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestBUffered {
    public static void main(String[] args) {
        try {
            BufferedWriter bid = new BufferedWriter(new FileWriter("D:\\data.txt"));
            String s  = null;
            for (int i=0;i<100;i++){
                s = String.valueOf(Math.random());
                bid.write(s);
                bid.newLine();
            }
            bid.flush();

            BufferedReader br = new BufferedReader(new FileReader("D:\\data.txt"));
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
            bid.close();
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
