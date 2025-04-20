package Q5;

import java.util.Collections;
import java.util.Scanner;

public class Task5Main {
    public  static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Product p1=new Clothing(231,"Kurta Shalwar","Clothing");
        Product p2=new Electronic(214,"Juicer Blender","Electronic");
        System.out.println("Enter the Discount Percentage");
        int discount=scan.nextInt();
        System.out.println("Enter the Warranty of item in Years");
        int warranty=scan.nextInt();
        if (p1 instanceof Clothing){
            ((Clothing) p1).applyDiscount(discount);
            p1.displayProductDetails();
        }
        if(p2 instanceof  Electronic){
            ((Electronic) p2).applyWarranty(warranty);
            p2.displayProductDetails();
        }
    }
}