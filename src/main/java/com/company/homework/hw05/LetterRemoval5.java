package com.company.homework.hw05;

public class LetterRemoval5 {
    public static void main(String[] args) {

        //Letter removal
        //Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the
        //phrase.

        String poem = new String("It’s winter, it’s winter, Let us skate and ski! It’s winter, it’s winter, It’s great fun for me!");
        System.out.println(poem);
        System.out.print("Возвращаемое значение: ");
        System.out.println(poem.replace('w','W'));
        System.out.print("Возвращаемое значение: ");
        System.out.println(poem.replace('t',' '));
        System.out.println(poem.replaceAll("It’s winter", "Bbbbbbrrrrrr"));
    }

}
