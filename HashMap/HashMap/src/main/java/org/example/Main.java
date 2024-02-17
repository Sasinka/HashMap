package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static CorrectWords fillMap(String[] list){
        CorrectWords correctWords = new CorrectWords();

        for(int i = 0; i < list.length; i++){
            correctWords.put(list[i], i);
        }
        return correctWords;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        CorrectWords dictionarry = new CorrectWords();
        String[] list = new String[]{"ahoj", "bravo", "Cecílie", "datel", "frankovka"};
        dictionarry = fillMap(list);


        String[] text = new String[] {"bravo", "ahoj"};
        System.out.println(dictionarry.isSpelledCorrectly(text));

    }
}