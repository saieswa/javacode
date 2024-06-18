public class Addition {

    void sum(int a,int b){
        System.out.println(a+b);

    }
    void sub(int a,int b){
        System.out.println(a-b);

    }
    void mul(int a,int b){
        System.out.println(a*b);

    }
    void div(int a,int b){
        System.out.println(a/b);

    }
    public static void main(String[] args) {
        Addition obj1=new Addition();

        obj1.sum(1,1);
        obj1.sub(1,1);
        obj1.mul(1,1);
        obj1.div(4,2);


    }
}
