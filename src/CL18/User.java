package CL18;

public class User {
    private  String name;
    private Mesanger mesanger;

    public User(String name, Mesanger mesanger) {
        this.name = name;
        this.mesanger = mesanger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mesanger getMesanger() {
        return mesanger;
    }

    public void setMesanger(Mesanger mesanger) {
        this.mesanger = mesanger;
    }
}
