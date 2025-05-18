public class PhuongThuc {

    public double sum;
    public double res;

    //Hàm không trả về kết quả
    public void cong2so()
    {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }

    //Hàm có trả về kết quả
    public double nhan2So()
    {
        int a = 5;
        int b = 10;
        res = a * b;
        return res;
    }

    //Hàm có tham số
    public void hcts(int a, int b)
    {
        System.out.println("a + b = " + (a + b));
    }

    public double nhan3So(int a, int b, int c)
    {
        return a * b * c;
    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2so();
        phuongThuc.nhan2So();
        phuongThuc.hcts(3, 5);
        phuongThuc.hcts(31, 15);
        System.out.println(phuongThuc.nhan3So(8, 10, 6));

        //System.out.println(phuongThuc.cong2so());
        System.out.println(phuongThuc.nhan2So() + 10);


    }
}
