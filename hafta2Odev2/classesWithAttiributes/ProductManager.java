package hafta2Odev2.classesWithAttiributes;

public class ProductManager {

    public void add(Product product){
        System.out.println("Eklendi "+product.getName());
    }
    public void delete(Product product){
        System.out.println("Silindi " +product.getName());
    }
    public void update(Product product){
        System.out.println("Güncellendi "+product.getName());
    }
}
