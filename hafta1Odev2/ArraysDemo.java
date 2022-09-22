package hafta1Odev2;

public class ArraysDemo {
    public static void main(String[] args) {
        double [] nums={1.2,1.4,1.5,1.8};
        double maks=0,total=0;
        for (double num:nums){
            total+=num;
            if(num>maks)
                maks=num;
        }
        System.out.println("Total -> "+total +" Maks ->"+maks);

    }
}
