package org.example;

import java.util.HashMap;

public class CorrectWords {


    HashMap<String, Integer> CorrectWords = new HashMap<String, Integer>();

    //todo nedat to jako interface???
    public boolean isSpelledCorrectly(String[] list){
        boolean answer = false;
        for(int i =0; i < list.length; i++){
            answer = this.CorrectWords.containsKey(list[i]);
            if (!answer) break;

        }
        return answer;
    }

    public CorrectWords() {
    }
    public CorrectWords(HashMap<String, Integer> correctWords) {
        CorrectWords = correctWords;
    }

    public HashMap<String, Integer> getCorrectWords() {
        return CorrectWords;
    }

    public void setCorrectWords(HashMap<String, Integer> correctWords) {
        CorrectWords = correctWords;
    }

    CorrectWords put(String s, Integer i){
        this.CorrectWords.put(s,i);
        return  this;
    }
}
