package CodeMessage;

public class Main {


    public static void main(String[] args) {
        CodeMessage codeMessage = new CodeMessage();

        codeMessage.konventerTegn('h');
        codeMessage.konventerTegn('b');
        codeMessage.konventerterPlainText("a");


        System.out.println(codeMessage);
    }
}

