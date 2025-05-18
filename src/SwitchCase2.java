public class SwitchCase2 {

    public static void main(String[] args) {

        String trinhduyet = " Chrome ";

        //Ham toLowerCase() dung chuyen chuoi ve chu thuong
        //Ham toLowerCase() dung chuyen chuoi ve chu in hoa
        //Ham trim() dung de cat bo khoang trang 2 dau cua chuoi



        switch (trinhduyet.toLowerCase().trim()){
            case "Chrome":
                System.out.println("Khoi chay Chrome");
                break;
            case "Edge":
                System.out.println("Khoi chay Edge");
                break;
            case "Firefox":
                System.out.println("Khoi chay Firefox");
                break;
            default:
                System.out.println("Khoi chay voi Chrome mac dinh");
                break;
        }

    }

}
