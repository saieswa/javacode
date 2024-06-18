import java.util.Scanner;
public class School {
    String passorfail(int score)
    {
        if(score<35){
            return "Fails";
        }
        else{
            return "Pass";
        }


    }
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        int total_mark=sai.nextInt();
        School obj=new School();
        String result=obj.passorfail(total_mark);
        System.out.println(result);


    }
}
