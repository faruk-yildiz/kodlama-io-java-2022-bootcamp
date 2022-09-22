package hafta1Odev2;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        int total=0;
        for (int i=1;i<sayi;i++)
        {
            if(sayi%i==0)
                total+=i;
        }
        if(sayi==total)
            System.out.println("Mükemmel Sayıdır");
        else
            System.out.println("Mükemmel sayı değildir");
    }
}
