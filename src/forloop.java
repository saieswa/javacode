import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {

        //for(int i=1;i<=10;i=i+1)
        //for(int i =10;i>=1;i=i-1){
          //  System.out.println(i);
       // }

     /*Scanner sai=new Scanner(System.in);
     int a=sai.nextInt();
     int b=sai.nextInt();
     for(int i=a;i<=b;i=i+1){
         System.out.println(i);
     }*/

        //for (int i=1;i<=10;i=i+1) {

           /* if (i % 2 == 0) {
                System.out.println("even " + i);
            }
            }
            */
        //count of odd no

        /*int oddcount=0;
        for (int i=1;i<=10;i=i+1)

        {
            if(i%2!=0){

                oddcount=oddcount+1;
                System.out.println("odd "+i);

            }
        }
        System.out.println(oddcount);*/

        //count even no

        /*int evencount=0;
        for(int i=1;i<=10;i=i+1){
            if(i%2==0){
                evencount=evencount+1;
                System.out.println(i);
            }
        }
        System.out.println("even count:"+evencount);*/

        //divisible by 3 and 5 range 1to 100

        for(int i=1;i<=100;i=i+1){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }

    }
}
