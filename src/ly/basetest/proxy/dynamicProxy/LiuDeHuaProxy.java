package ly.basetest.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LiuDeHuaProxy {

    LiuDeHua liuDeHua = new LiuDeHua();

    public Person getProxy() {
        return (Person) Proxy.newProxyInstance(LiuDeHuaProxy.class.getClassLoader(), liuDeHua.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")){
                    System.out.println("我是他经纪人,想请她唱歌,先拿十万元");
                    return method.invoke(liuDeHua,args);
                }
                if(method.getName().equals("dance")){
                    System.out.println("我是他经纪人,想请她跳舞,先拿十万元");
                    return method.invoke(liuDeHua,args);
                }
                return null;
            }
        });
    }
}

