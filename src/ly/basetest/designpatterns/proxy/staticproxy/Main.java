package ly.basetest.designpatterns.proxy.staticproxy;

public class Main {
    public static void main(String[] args) {
        //要学习的lilili
        Lilili lilili = new Lilili();
        //为lilili加油的aid
        LililiAid aid = new LililiAid(lilili);

        aid.coding();
    }
}
