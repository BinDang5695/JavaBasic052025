package VongLapFor;

import static java.awt.SystemColor.menu;

public class DemoForBasic {

    public static void main(String[] args) {

        for (int n = 0; n <= 1000; n+=2) {
            System.out.println("So thu tu: " + n);
            if (n == 100) {
                System.out.println("Dung lai vi = 100");
                break;
            }
        }
    }
}
