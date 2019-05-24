package ly.basetest.designpatterns.proxy.staticproxy;

/**
 * 实现类
 *
 * 静态代理的实现类喝代理类实现统一接口
 */
public class Lilili implements Programmer {

    @Override
    public void coding() {
        System.out.println("lilili每天都在写代码,认真学习");
    }
}
