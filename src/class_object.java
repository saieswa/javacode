public class class_object {

    String name="";
    String proc="" ;
    int ram=0;
    int price=0;

    public static void main(String[] args) {
        class_object lap1=new class_object();
        lap1.name="hp";
        lap1.proc="i5";
        lap1.ram=6;
        lap1.price=400000;

        class_object lap2=new class_object();
        lap2.name="hp";
        lap2.proc="i6";
        lap2.ram=8;
        lap2.price=500000;


        System.out.println(lap1.price);
        System.out.println(lap2.price);


    }
}
