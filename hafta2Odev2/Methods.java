package hafta2Odev2;

public class Methods {
    public static void main(String[] args) {
        search(1);
    }
    public static void search(int number){
        int [] array={1,2,3,4,5,6,7,8};
        boolean flag=false;
        for(int num:array){
            if(num==number) {
                flag=true;
                break;
            }

        }
        if(flag)
            showMessag("Aradığınız sayı dizi içerisinde var");
        else
            showMessag("Aradığınız sayı dizi içerisinde yok");
    }
    public static void showMessag(String messsage){
        System.out.println(messsage);
    }
}
