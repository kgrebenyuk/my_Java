package HW17;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("iPhones call");
    }

    @Override
    public void sms() {
        System.out.println("iPhones sms");
    }

    @Override
    public void internet() {
        System.out.println("iPhones internet");
    }

    @Override
    public void showOsName() {
        System.out.println("Os Name: iOS");
    }
}
