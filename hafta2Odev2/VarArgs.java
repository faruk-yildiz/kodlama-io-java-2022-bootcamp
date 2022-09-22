package hafta2Odev2;

public class VarArgs {
    public static void main(String[] args) {
        findSum(1,2,3,4,5,6,7,8,9);
    }
    public static void findSum(int... numbers){
        int total=0;
        for(int number:numbers)
            total+=number;
        System.out.println("Sum of all numbers ->> "+total);
    }
}
