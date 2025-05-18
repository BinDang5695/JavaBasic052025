package VongLapFor;

public class DemoForAdvance {

    public static void main(String[] args) {

        int arr[] = {40, 50, 12, 23, 44, 56, 78};
        for(int i : arr){
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i++)
        {
            System.out.println(arr[i]);
        }

        String menu[] = {"Dashboard", "Customer", "Project", "Task"};
        for(String menuName: menu){
            //System.out.println(menuName);
        }

    }

}
