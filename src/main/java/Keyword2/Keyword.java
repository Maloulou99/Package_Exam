package Keyword2;

import java.security.Key;
import java.util.ArrayList;

public class Keyword {

    private String word;
    private String definition;
    private ArrayList<Keyword> seeAlso = new ArrayList<>();

    public Keyword(String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    public boolean matches(String searchWord) {
        return word.contains(searchWord);
    }

    public boolean addWord(Keyword keyword){
        return seeAlso.add(keyword);
    }

    public String toString(){
        return word + " " + definition;
    }
    public static void main(String[] args) {
        Keyword keyword = new Keyword("Hund", "Kan sige vuf");
        Keyword keyword1 = new Keyword("kat", "Kan sige miav");


        keyword.addWord(keyword);
        keyword1.addWord(keyword1);

        System.out.println(keyword.matches("Hund"));
        System.out.println(keyword);
    }

}
