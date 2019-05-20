package ly.basetest.Stream;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesReadTest {
    public static void main(String[] args) {
        readPropertiesFileByReasourceAsStream();
    }

    private static void readPropertiesFileByReasourceAsStream() {
        try {
            //读取统一包下的配置文件
            InputStream resourceAsStream = PropertiesReadTest.class.getResourceAsStream("TLInterface_config.properties");
            //读取位于另外包下的配置文件
            //InputStream resourceAsStream = PropertiesReadTest.class.getClassLoader().getResourceAsStream("com/it/TLInterface_config.properties");
            //读取位于src根目录下的配置文件
            //InputStream resourceAsStream = PropertiesReadTest.class.getClassLoader().getResourceAsStream("TLInterface_config.properties");
            //读取位于另一source文件夹下的配置文件
            //InputStream resourceAsStream = PropertiesReadTest.class.getClassLoader().getResourceAsStream("TLInterface_config.properties");
            Properties p = new Properties();
            p.load(resourceAsStream);

            System.out.println("----使用getResourceAsStream方法读取properties文件----");
            System.out.println("p.name"+p.getProperty("com.tenwa.tl.bank.serverUrl"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
