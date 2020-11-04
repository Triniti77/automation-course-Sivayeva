package com.company.homework.hw08;

import org.w3c.dom.ls.LSOutput;

public class LibraryApp {
    public static void main(String[] args) {

        Book b1 = new Book("Преступление и наказание", "Достоевский", "2018", "Описание", "1");
        Book b2 = new Book("Кобзар", "Шевченко Т.Г.", "2020", "Опис", "1");
        Book b3 = new Book();


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
