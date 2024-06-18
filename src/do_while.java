import java.util.Random;
import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        
       /* Random rand=new Random();
        int num=0;

        while(num!=5){
            num=rand.nextInt();
            System.out.println(num);

        }*/

        /*int count=0;
        do{
            System.out.println("sai");
            count=count+1;
        }while(count<=1);*/
        Scanner sai=new Scanner(System.in);
        int count=0;
        do{
            System.out.println("enter the number.10:");
            count=sai.nextInt();
        }while (count<10);




    }
}
