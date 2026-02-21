package application;

import entites.Comment;
import entites.Post;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(moment, title, content, likes);

        sc.close();
    }
}
