package StaticJava;

public class LoginPage {

    public static void main(String[] args) {

        WebUI.openURL("https://crm.anhtester.com/admin/authentication");
        WebUI.setText("admin@example.com");
        WebUI.setText("123456");
        WebUI.clickElement("Login button");



    }

}
