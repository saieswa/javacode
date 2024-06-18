import java.util.Scanner;
public class middle_array {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        int size=sai.nextInt();
        int[]marks=new int[size];

        for(int i=0;i<= size-1;i++){
            marks[i]=sai.nextInt();

        }
        int middleIndex=marks.length/2;
        int middleElement=marks[middleIndex];
        System.out.println("Middle element:"+middleElement);

    }
}
