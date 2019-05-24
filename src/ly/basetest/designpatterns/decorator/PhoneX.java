package ly.basetest.designpatterns.decorator;

//具体的实现
public class PhoneX implements Phone{

    @Override
    public void call() {
        System.out.println("打电话");
    }
}
