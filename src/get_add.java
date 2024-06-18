import java.util.Scanner;
public class get_add {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);

        int a=sai.nextInt();
        int b=sai.nextInt();
        int c= sai.nextInt();
        int d=a*b*c;
        int e=a+b+c+d;
        int f=d/e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
