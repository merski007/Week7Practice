package practice;

/**
 *
 * @author mjmersenski
 */
public class Product {
    private int prodId;

    public Product(int prodId) {
        setProdId(prodId);
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    
    public static void main(String[] args) {
        Product prod = new Product(100);
        int prodId = prod.getProdId();
        
        System.out.println("Thank for purchasing item #"+prodId+".");
    }
}
