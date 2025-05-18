package Arrrays;

public class DemoMang1 {

    public static void main(String[] args) {

        //Khai bao mang rong, chua mang gia tri
        int number1[] = new int[5];

        number1[0] = 10;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 40;
        number1[4] = 50;

        System.out.println("Do dai mang: " + number1.length);

        //Duyet mang de lay gia tri ra
        for (int i = 0; i < number1.length; i++){
            System.out.println(number1[i]);
        }

        System.out.println("========");
        for (int i = 2; i < 5; i++){
            System.out.println(number1[i]);
        }

        System.out.println("========");
        for(int number: number1)
        {
            System.out.println(number);
        }


    }

}
