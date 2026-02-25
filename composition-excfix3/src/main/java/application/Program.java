package application;


import model.entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    void main(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product("TV", 1000.00);

        sc.close();
    }

}
