package Keyword;

import com.sun.source.tree.BreakTree;

import java.security.Key;
import java.util.ArrayList;
import java.util.Scanner;

public class Keyword {


    private String word;
    private String definition;
    private ArrayList<Keyword> seeAlso = new ArrayList<>();


    public Keyword(String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    public boolean matches(String searchWord) {
        return word.equalsIgnoreCase(searchWord);
    }
    public void addWord(Keyword keyword){
        seeAlso.add(keyword);
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", seeAlso=" + seeAlso +
                '}';
    }

    public static void main(String[] args) {

        Keyword keyword = new Keyword("Dog", "Dogs can bark");
        Keyword keyword1 = new Keyword("Cat", "Cats can say 'Miav'");
        Keyword keyword2 = new Keyword("Dog", "Dogs are loving animals");
        Keyword keyword3 = new Keyword("Elephants", "Elephants are big animals");

        keyword.addWord(keyword1);
        keyword.addWord(keyword2);
        keyword.addWord(keyword3);

        //This word is a match
        System.out.println(keyword.matches("Dog") );
        //This word is not a match
        System.out.println(keyword.matches("Snacks"));
        //The keyword and the list, will be showed here
        System.out.println(keyword);




    }
}
