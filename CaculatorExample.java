import java.util.Scanner;

public class CaculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x:");
        int x= scanner.nextInt();
        System.out.println("nhap y:");
        int y = scanner.nextInt();
        CaculatorExample calc = new CaculatorExample();
        calc.caculate(x,y);
    }
    public void caculate(int x,int y){
        try {
            int a = x +y;
            int b = x-y;
            int c= x*y;
            int d =x/y;
            System.out.println("tong x+y= "+ a);
            System.out.println("tong x-y= "+ b);
            System.out.println("tong x*y= "+ c);
            System.out.println("tong x/y= "+ d);
        }
        catch (Exception e) {
            System.out.println("xay ra ngoai le" + e.getMessage());
        }
    }
}
