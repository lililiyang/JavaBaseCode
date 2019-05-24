package ly.basetest.proxy.dynamicProxy;

public class ProxyTest {
    public static void main(String[] args) {
        LiuDeHuaProxy proxy = new LiuDeHuaProxy();
        Person person = proxy.getProxy();
        String sing = person.sing("冰雨");
        System.out.println(sing);
        String dance = person.dance("江南style");
        System.out.println(dance);
    }
}
