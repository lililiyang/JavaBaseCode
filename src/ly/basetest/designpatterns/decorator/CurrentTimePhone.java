package ly.basetest.designpatterns.decorator;

import java.util.Date;

/**
 * 打完电话通知当前时间
 */
public class CurrentTimePhone extends PhoneDecorator {
    public CurrentTimePhone(Phone phone) {
        super(phone);
    }

    public void currentTime(){
        System.out.println("当前时间是:"+new Date().toString());
    }

    @Override
    public void call() {
        super.call();
        currentTime();
    }
}
