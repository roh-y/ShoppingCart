/**
 * Created by rohityarlagadda on 5/13/17.
 */
public class Product {
    int id;
    String name;
    int cost;
    int quant;




    public Product(int id, String name, int cost, int quant) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quant=quant;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuant() {
        return quant;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quant=" + quant +
                '}';
    }

    }


