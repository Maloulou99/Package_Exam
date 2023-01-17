package Article;

public class Main {
    public static void main(String[] args) {
        String longText = "This is the body of the article. It can be a long text, like the description of this exercise.";
        Article article = new Article("Article", longText, "Ukendt");

        System.out.println(article.getWords());
        System.out.println(article.getLongestWord());
    }

}
