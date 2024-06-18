import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sai= new Scanner(System.in);

        /*int score=sai.nextInt();

        if(score<50){
            System.out.println("improve");
        }
        else if(score>=50 && score<=70){
            System.out.println("good job");
        }
        else{
            System.out.println("excellent");
        }*/

        /*int a= sai.nextInt();
        int b= sai.nextInt();
        int c= sai.nextInt();
        int d= sai.nextInt();
        int e= sai.nextInt();
        int sum=a+b+c+d+e;
        int avg=sum/5;
        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
        System.out.println("d "+d);
        System.out.println("e "+e);
        System.out.println("sum "+sum);
        System.out.println("avg "+avg);

        if(avg<35){
            System.out.println("additional cls ");
        }
        else{
            System.out.println("good");
        }*/

       /* String color=sai.nextLine();

        if(color.equals("red")){
            System.out.println("stop");
        }
        else if(color.equals("yellow")){
            System.out.println("get ready");
        }
        else if(color.equals("go")){
            System.out.println("go");
        }*/
        /*System.out.println("salary");
        int salary=sai.nextInt();
        System.out.println("age");
        int age=sai.nextInt();


        if(salary>=20000 || age<=25){
            System.out.println("Eligible for loan ");
            System.out.println("loan");
            int loan=sai.nextInt();
            if(loan<50000){
                System.out.println("loan accepted");
            }
        }
        else{
            System.out.println("no loan");
        }*/

        //ternary

        /*boolean rain =true;
        String result= rain?"take umbrella":"enjoy the sunlight";
        System.out.println(result);*/

        int a=sai.nextInt();
        int b=sai.nextInt();
        /*if(a>b){
            System.out.println("print a:"+ a);
        }
        else{
            System.out.println("no print");
        }*/
        String greater=a>b?"print a ":"not print";
        System.out.println(greater);


    }
}
