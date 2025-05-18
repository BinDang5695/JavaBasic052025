public class Bien {

    String address = "Đà Nẵng"; // Biến toàn cục
    static String age = "18";

    public void sayHello() {
        int n = 10; // Biến local
        System.out.println("Giá trị của n là: " + n);
        System.out.println(address);
    }

    public void getInfo() {
        System.out.println(address);
    }

    public static void main(String[] args) {

        int number1 = 123456;
        int number2 = 789;

        String name = "Bin";
        String ten = "Linh";

        System.out.println(name);
        System.out.println(ten);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(age);

        Bien bien = new Bien();
        bien.sayHello();
        bien.getInfo();


    }
}
