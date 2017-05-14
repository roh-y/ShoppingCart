import java.util.Iterator;
import java.util.*;

/**
 * Created by rohityarlagadda on 5/14/17.
 */
public class Main {
    public static void main(String[] args){
        Cart cart= new Cart();
        Product item1= new Product(1,"Water",2,10);
        Product item2= new Product(2,"Food",5,10);
        cart.products.add(item1);
        cart.products.add(item2);
        System.out.print("Using toString \n");
        System.out.print("Items in the cart are \n"+cart.products.toString());
        System.out.println("Your Total Amount Due is:"+cart.totalCost()); //Using iterator


        System.out.println("Enter Discount Coupon if you have any, or else hit enter");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Your final amount is");
        cart.afterDiscount(i);



    }
}
