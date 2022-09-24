package HW11;

public class HW11 {


    public static void main(String[] args) {


        // String names[] = new String[10];

        String names[] = {"Ivan","AaraS","OLEg"};
        String name1 = names[0];
        char ch= name1[0];

        синтаксиса с  "[]"  - в JAVA нет ?

        for(String name : names) {
            if (name.startsWith("A") &&  name.length() > 4 )
                System.out.println(name);
        }



/*
        int arr[] = new int[100];
        Random random = new Random();

        int summ =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < 100; i ++)
        {
            if (arr[i] %2 != 0)         summ +=arr[i];
        }
            System.out.println(summ);
*/


 /*       int max = arr[0];
        for (int i : arr)
            if (max > i)
                max = i;

        System.out.println("max =" + max);
*/

    }



}
