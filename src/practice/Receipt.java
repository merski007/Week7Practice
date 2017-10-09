package practice;

import java.util.Scanner;

/**
 *
 * @author mjmersenski
 */
public class Receipt {
    Scanner keyboard = new Scanner(System.in);
    
    private LineItem[] item;
    private int numberOfItems;
    
    
    public Receipt(int numberOfItems){
        item = new LineItem[numberOfItems];
    }
    
    public void setLineItems(){
        for(int i = 0; i < item.length; i++){
            System.out.println("Please enter in the item number: ");
            int itemNumber = keyboard.nextInt();
            keyboard.nextLine();
            
            item[i] = new LineItem(itemNumber);
        }
    }
    
    public int getItemId(int x){
        return item[x].getProductId();
    }
    
    public static void main(String[] args) {
            
        Receipt transaction = new Receipt(3);
        transaction.setLineItems();
        System.out.println("");
        System.out.println(transaction.getItemId(0));
        System.out.println(transaction.getItemId(1));
        System.out.println(transaction.getItemId(2));
        
    }
}
