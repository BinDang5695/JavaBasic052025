package ToanTu;

public class DemoToanTu {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 20;
        double d, e, f;
        //d = e = f = 0;

        // Toán tử số học
        System.out.println("c / a = " + (c / a));
        System.out.println("c % a = " + (c % a));
        System.out.println(a++);
        System.out.println(a);
        System.out.println("a = " + (a += 5));
        System.out.println(a);

        //Toán tử so sánh và logic
        System.out.println("So sánh a > b: " + (a != b));
        System.out.println((a > b) && (b > c));
        System.out.println((a > b) || (b > c) || (c > a));

    }

}
