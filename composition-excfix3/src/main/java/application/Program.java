package application;


import model.entites.OrderItem;
import model.entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    void main(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product("TV", 1000.00);

        OrderItem oi1 = new OrderItem(1, 1000.00, p);

        System.out.println(oi1.getProduct().getName());



        sc.close();
    }

}
