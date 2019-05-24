package ly.basetest.designpatterns.decorator;

/**
 * 打电话之前响音乐
 */
public class MusicPhone extends PhoneDecorator {
    public MusicPhone(Phone phone) {
        super(phone);
    }
    //定义想要扩展的方法
    public void listenMusic(){
        System.out.println("继续跑 带着赤子的骄傲，生命的闪耀不坚持到底怎能看到，与其苟延残喘不如纵情燃烧");
    }

    @Override
    public void call() {
        listenMusic();
        super.call();
    }
}
