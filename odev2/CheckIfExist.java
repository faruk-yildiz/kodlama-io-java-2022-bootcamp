package odev2;

public class CheckIfExist {
    public static void main(String[] args) {
        int [] dizi={1,2,3,4,5,6,7,8,9};
        int aranacak=4;
        for (int num:dizi) {
            if (num==aranacak) {
                System.out.println("Mevcut");
                break;
            }
        }
    }
}
