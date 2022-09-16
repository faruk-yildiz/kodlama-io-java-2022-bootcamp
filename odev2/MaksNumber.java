package odev2;

public class MaksNumber {
    public static void main(String[] args) {
        int a=30,b=35,c=30,maks=0;
        if(a>b && a>c)
            maks=a;
        else if(b>a && b>c)
            maks=b;
        else
            maks=c;
        System.out.println("Maksimum -> "+maks);
    }
}
