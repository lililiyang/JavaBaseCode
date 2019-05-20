package ly.basetest.Stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestTransform2 {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            String s = null;
            s = br.readLine();
            while(s != null){
                if("exit".equals(s)) {
                    break;
                }
                System.out.println(s.toUpperCase());
                s = br.readLine();
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
