package ly.basetest.proxy.staticproxy;

/**
 * 代理类
 */
public class LililiAid implements Programmer{

    private Lilili lilili;
    public LililiAid(Lilili lilili){
        this.lilili = lilili;
    }

    public void refuel(){
        System.out.println("lilili在学习,加油啊");
    }

    @Override
    public void coding() {
        //lilili  在学习
        lilili.coding();
        //aid 为lilili加油
        refuel();
    }
}
