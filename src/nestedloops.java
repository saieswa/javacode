public class nestedloops {
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++){
            System.out.println(i+" ."+"sai");
            for(int j=1;j<=2;j++){
                System.out.println(j+"."+"smile");
            }
        }*/

        /*for (int teacher=1;teacher<=3;teacher++) {
            for(int i=1;i<=5;i++){
                System.out.println(i+" sai");
            }

        }*/


        // print***
        //***
        //***

        /*for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++) {
            System.out.print("*");
        }
            System.out.println();
        }*/

        //*
        //**
        //***

        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
