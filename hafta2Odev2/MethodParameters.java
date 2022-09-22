package hafta2Odev2;

public class MethodParameters {
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(subtract(6,4));
        System.out.println(multiply(3,7));
        System.out.println(division(4,5));
    }

    //BASIC CALCULATOR

    public static int add(int a,int b){ return a+b; }
    public static int subtract(int a,int b){ return a-b; }
    public static int multiply(int a,int b){ return a*b; }
    public static double division(int a,int b){
        if(b==0)
        {
            System.out.println("Bölen sıfır olamaz");
            return 0;
        }
        else{
            return a/(double)b;
        }
    }
}
