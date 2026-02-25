package application;


import model.entites.Client;
import model.entites.OrderItem;
import model.entites.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    void main() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));

        System.out.println(cli);



        sc.close();
    }

}
