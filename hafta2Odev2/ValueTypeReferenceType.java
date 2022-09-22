package hafta2Odev2;

public class ValueTypeReferenceType {
    public static void main(String[] args) {

        // value type
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi1=30;
        System.out.println(sayi2);

        // reference type

        int [] array ={1,2,3};
        int [] array2={4,5,6};
        array=array2;
        array2[0]=40;
        System.out.println(array[0]);

    }
}
