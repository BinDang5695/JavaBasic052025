package StaticJava;

public class WebUI {

    public static void openURL(String url)
    {
        System.out.println(url);
    }

    public static void clickElement(String elementName)
    {
        System.out.println("Click element: " + elementName);
    }

    public static void setText(String text)
    {
        System.out.println("Set Text: " + text);
    }

    public static String getElementtext(String elementName)
    {
        return "text";
    }

    public static void main(String[] args) {

        openURL("https://crm.anhtester.com/admin/authentication");
        WebUI webUI = new WebUI();
        webUI.setText("Bin dep zai");
        webUI.setText("123456");
        webUI.clickElement("Login button");




    }

}
