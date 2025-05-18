package DieuKienIFELSE;

public class DemoIF {

    public static void main(String[] args) {

        int age = 18;
        String address = "Da Nang";
        String header = "Login CRM Page";

        //So sanh bang dung ham equals()
        //So sanh chua trong chuoi dung ham contains

        if (age > 18 && address.equals("Da Nang"))
        {
            System.out.println("Di nvqs");
        }

        if (header.contains("Login"))
        {
            System.out.println("Da den trang Log in");
        }


    }

}
