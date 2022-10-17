package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow thst`s awesome!");

        //Para instanciar um objeto Date completo no caso com data e horario,  é preciso utilizar um SimpleDateFormat onde é possível passar como argumento uma mascara no caso "dd/MM/yyyy HH:mm:ss" como isso consigo utilizar a data completa. pode ser que de um erro na parte da linha e para resolver isso usar o throws ParseException. //

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zeland", "I`m going to visit this wonderful country", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        //Se for so dar um print ele vai imprimir apenas um código porque na minha classe post nao tem o metodo toString precisamos implementar o metodo toString. //
        System.out.println(p1);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);

    }
}
