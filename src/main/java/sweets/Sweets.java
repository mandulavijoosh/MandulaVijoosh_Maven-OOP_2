package sweets;

public class Sweets implements Comparable<Sweets>  {
	
	private String name;
    private int price;
    private int weight;

    public Sweets(String name,int price,int weight){
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

	//@Override
	public int compareTo(Sweets o) {
		if(o.price > this.price)
            return 1;
        if(o.price < this.price)
            return -1;
        else
            return 0;
	}
	
	 @Override
	    public String toString() {
	        return "Sweets{" +
	                "name='" + name + '\'' +
	                ", price=" + price +
	                ", weight=" + weight +
	                '}';
	    }

}