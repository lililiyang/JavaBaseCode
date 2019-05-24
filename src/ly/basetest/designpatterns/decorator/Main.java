package ly.basetest.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Phone phoneX = new PhoneX();
        phoneX = new MusicPhone(phoneX);
        phoneX = new CurrentTimePhone(phoneX);

        phoneX.call();
    }
}
