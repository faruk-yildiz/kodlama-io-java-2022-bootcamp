package hafta2Odev2.recapDemo_Classes;

public class Calculator {
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
