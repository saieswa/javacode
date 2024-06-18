import java.util.Scanner;
import java.lang.String;
public class get_input1 {
    public static void main(String[]args){
        Scanner sai=new Scanner(System.in);

        System.out.println("My name is ");
        String name = sai.nextLine();

        System.out.println("My age is ");
        int a=sai.nextInt();

        System.out.println("Address:");
        sai.nextInt();
        String address=sai.nextLine();


    }
}
