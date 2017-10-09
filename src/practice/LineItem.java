package practice;

/**
 *
 * @author mjmersenski
 */
public class LineItem {

    private int prodId;
    private Product product;

    public LineItem(int prodId) {
        product = new Product(prodId);
    }

    public int getProductId() {
        return product.getProdId();
    }
    
    public static void main(String[] args) {
        LineItem item = new LineItem(100);
        
        System.out.println("Thank you for choosing item #"+item.getProductId());
    }
}
