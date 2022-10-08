package HW16;

public class HW16 {
    public static void main(String[] args) {

        String[] personArr = {
                "Василий,01,04,2000,vasPup@gmail.com,322223,Пупкин,99,160,0",
                "Геннадий,03,08,2001,genPetr@gmail.com,123321,Петров,90,150,0",
                "Андрей,10,11,2002,andrVas@gmail.com,456654,Васечкин,120,170,0"
        };
        Person[] person = new Person[personArr.length];

        for (int i = 0; i < personArr.length; i++) {
            String[] str = personArr[i].split(",");
            person[i] = new Person(str[0], str[1], str[2], str[3], str[4], str[5], str[6],
                    Integer.parseInt(str[7]), Integer.parseInt(str[8]), Integer.parseInt(str[9]));
        }
        for (int i = 0; i < personArr.length; i++) {
            person[i].printAccountInfo();
        }

        int[] weight = {105, 100, 130};
        int[] pressure = {170, 155, 180};
        int[] stepNum = {3000, 4000, 5000};

        System.out.println("\n*** Новые данные ***");
        for (int i = 0; i < personArr.length; i++) {
            System.out.println(person[i].getfName() + " " + person[i].getsName() +
                    " вес:" + weight[i] + ", давление: " + pressure[i] + ", шагов за день:" + stepNum[i]);
            person[i].setWeight(weight[i]);
            person[i].setPressure(pressure[i]);
            person[i].setStepNum(stepNum[i]);
        }
        for (int i = 0; i < personArr.length; i++) {
            person[i].printAccountInfo();
        }
    }
}
