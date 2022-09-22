package hafta2Odev2.classesWithAttiributes;

public class Main {
    public static void main(String[] args) {
        Product product=new Product(1,"Asus","Gaming",15000,1000,"siyah");


        ProductManager productManager=new ProductManager();
        productManager.add(product);
        productManager.update(product);
        productManager.delete(product);
    }
}
