package Q6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Car c1=new Car(2008,"Toyota",6);
        Bike b1=new Bike(2016,"SuperPower",2);
        c1.displayDetails();
        b1.displayDetails();
    }
}