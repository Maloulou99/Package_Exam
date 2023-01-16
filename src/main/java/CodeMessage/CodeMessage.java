package CodeMessage;

public class CodeMessage {

    private char plainText;
    private int[] ciphers = new int[plainText];
    private int shiftValue;


    public int konventerTegn(char c) {
        c = Character.toUpperCase(c);
        if (c < 'A' || c > 'Z') {
            return -1;
        }
        return c - 'A' + 1;
    }

    public int[] konventerterPlainText(String plainText){
        for (int i = 0; i < ciphers.length ; i++){
            int tal = konventerTegn(plainText.charAt(i));
            ciphers[1] = tal;
        }
        return ciphers;
    }

    public String toString(){
        return  ciphers.length + " " + plainText + " " + shiftValue;
    }


}
