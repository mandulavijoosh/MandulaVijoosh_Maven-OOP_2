package gift;

import chocolates.Chocolate;
import sweets.Sweets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gift {
	private ArrayList<Chocolate> chocolates;
    private ArrayList<Sweets> sweets;

    public Gift(){
        chocolates=new ArrayList<Chocolate>();
        sweets=new ArrayList<Sweets>();
    }
    
    public void addChocolates(Chocolate... chocolates){
        this.chocolates.addAll(Arrays.asList(chocolates));
    }

    public void addSweets(Sweets... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }
    
    public void sort(){
        Collections.sort(this.chocolates);
        Collections.sort(this.sweets);
        System.out.println(this.chocolates);
        System.out.println(this.sweets);
    }
    
    public ArrayList<Chocolate> getChocolates() {
        return this.chocolates;
    }

    public ArrayList<Sweets> getSweets() {
        return this.sweets;
    }
    
    public int findTotalWeight(){
        int weight=0;

        for(Chocolate c: this.chocolates)
            weight+=c.getWeight();
        for(Sweets s: this.sweets)
            weight+=s.getWeight();

        return weight;
    }

}
