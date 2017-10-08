package practice;

/**
 *
 * @author mjmersenski
 */
public class Product {
    private int prodId;
    private String name;

    public Product(int prodId, String name) {
        setProdId(prodId);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    
    public static void main(String[] args) {
        Product prod = new Product(100,"Fritos");
        String name = prod.getName();
        int prodId = prod.getProdId();
        
        System.out.println("Thank for purchasing "+name+". for easy ordering, use the product ID ("+prodId+") next time.");
    }
}
