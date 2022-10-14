package CL18;

public class Main {
    public static void main(String[] args) {


        User [] users  = new User[3];

        users[0] = new User("Us1", new TelegramMsg());
        users[1] = new User("Us2", new TelegramMsg());
        users[2] = new User("Us3", new ViberMsg());

        for(User u : users){
            u.getMesanger().sendMessge("Black friday");
        }

    }
}
