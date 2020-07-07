package com.epam.first_maven;

import java.util.Scanner;

import chocolates.*;
import gift.*;
import sweets.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("chocolates....");
        Chocolate chocolate3=new Gems("Gems",50,20);
        Chocolate chocolate1=new Dairymilk("Dairy Milk",60,20);
        Chocolate chocolate2=new Perk("Perk",30,20);
        System.out.println("Sweets....");
        Sweets sweets1=new Gulabjamun("Gulabjamun",200,200);
        Sweets sweets2=new Kajubarfi("Kajubarfi",300,100);
        Sweets sweets3=new Jalebi("Jalebi",400,100);
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3);
        System.out.println("Sorting items in gift according to price");
        gift.sort();
        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());
    }
}
