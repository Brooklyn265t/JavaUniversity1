package Mirea.Homework3;

import Mirea.Homework3.Author;
import java.lang.*;

public class AuthorTest {
    public static void main(String[] args) {
        Author a = new Author("Ana Fomkina", 'f', "anafomkina@mail.ru"); 
        System.out.println(a);
        Author b = new Author("Max Dolgov", 'm', "mxdv2091m@mail.ru"); 
        System.out.println(b); 
    }
}
