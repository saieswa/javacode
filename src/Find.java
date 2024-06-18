import java.util.Scanner;
public class Find {
    int evenorodd(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        int a=sai.nextInt();
        Find obj=new Find();
        obj.evenorodd(a);


    }
}
