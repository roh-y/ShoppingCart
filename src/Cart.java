import java.util.*;

/**
 * Created by rohityarlagadda on 5/13/17.
 */
public class Cart {


    Collection<Product> products = new ArrayList<>();

    public void add(Product item){
        products.add(item);
    }

    public void remove(Product item){
        products.remove(item);
    }

    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }

    public double totalCost(){
        Iterator<Product> iterator = products.iterator();
        int sum=0;

        while (iterator.hasNext()){
            sum=sum+iterator.next().cost;
        }

        return sum;
    }

    public  void afterDiscount(int a){
        double dsum=0;
        switch (a){
            case 100:
                dsum=totalCost()-(totalCost()*0.10);
                System.out.println(dsum);
                break;
            case 200:
                dsum=totalCost()-(totalCost()*0.20);
                System.out.println(dsum);
                break;
            case 300:
                dsum=totalCost()-(totalCost()*0.30);
                System.out.println(dsum);
                break;
            default:
                System.out.println("You Coupon Expired ");
                System.out.println(totalCost());
                break;
        }

    }



}
