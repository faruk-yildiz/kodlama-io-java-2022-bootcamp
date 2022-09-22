package hafta1Odev2;

import java.util.Scanner;

public class ArkadasSayilar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("İki sayi giriniz");
        int sayi=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int total1=0,total2=0;
        for (int i=1;i<sayi;i++)
        {
            if(sayi%i==0)
                total1+=i;
        }
        for (int i=1;i<sayi2;i++){
            if(sayi2%i==0)
                total2+=i;
        }
        if(total1==sayi2 && total2==sayi)
            System.out.println("Arkadaş sayılar");
        else
            System.out.println("Arkadaş sayı değiller");
    }
}
