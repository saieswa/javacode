import java.util.Scanner;
public class If {
    public static void main(String[] args) {

        /*boolean rain=false;
        if(rain){
            System.out.println("take an umbrella");
        }
        else{
            System.out.println("Enjoy the sunlight");
        }*/

        Scanner sai=new Scanner(System.in);
        int num1=sai.nextInt();
        int num2= sai.nextInt();
        if(num1==num2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}
