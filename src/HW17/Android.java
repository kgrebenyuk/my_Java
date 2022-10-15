package HW17;

public class Android implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android sms");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }

    @Override
    public void showOsName() {
        System.out.println("Os Name: Android");
    }
}
