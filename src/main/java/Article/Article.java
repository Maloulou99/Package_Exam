package Article;

import java.util.ArrayList;
import java.util.Set;

public class Article {


    private String heading;
    private String body;
    private String author;


    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }


    public String getLongestWord() {
        String longestWord = "";
        String[] words = body.split("\\W+");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public ArrayList<String> getWords() {
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String word : body.split("\\W+")) {
            uniqueWords.add(word);
        }
        return uniqueWords;

    }

    @Override
    public String toString() {
        return "Article{" +
                "heading='" + heading + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
