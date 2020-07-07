package chocolates;
 
public class Chocolate implements Comparable<Chocolate> {
	private String name;
    private int price;
    private int weight;
    
    public Chocolate(String name,int price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getWeight() {
        return this.weight;
    }
    public int compareTo(Chocolate o) {
        if(o.price > this.price)
            return 1;
        if(o.price < this.price)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", weight=" +this.weight +
                '}';
    }
}
