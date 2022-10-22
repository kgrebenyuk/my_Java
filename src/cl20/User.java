package cl20;

public class User {
    //прізвище, вік, стать, місто(4 міста), хоббі(одне з трьох на вибір)
    public  String sName;
    public int age;
    public  boolean sex;

    Cities city;
    Hoby hoby;

    User( String sName, int age, boolean sex, Cities City, Hoby hoby){
        this.sName = sName;
        this.age = age;
        this.sex = sex;
        this.city = City;
        this.hoby = hoby;

    };


}
