package odev2;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        String output="Asal Değil";
        int sayi=scanner.nextInt();
        if(sayi==2)
            output="Asal";
        for (int i=2;i<sayi;i++)
        {
            if(sayi%i==0)
            {
                output="Asal Değil";
                break;
            }
            output="Asal";
        }
        System.out.println(output);

    }
}
