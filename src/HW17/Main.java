package HW17;

public class Main {
    public static void main(String[] args) {

        Android android = new Android();
        iPhones iphones = new iPhones();

        android.sms();
        android.call();
        android.internet();

        iphones.sms();
        iphones.call();
        iphones.internet();


    }
}
