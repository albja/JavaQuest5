/**
 * Decipherer
 */
public class Decipherer {
    public static String decode(String message) {
        int messageLength = message.length() / 2;
        String subMessage = message.substring(5, messageLength + 5);
        String replaceChar = subMessage.replace("@#?", " ");
        return new StringBuilder(replaceChar).reverse().toString();

    };

    public static void main(String[] args) {
        String[] toDecode = { "0@sn9sirppa@#?ia'jgtvryko1", "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!" };
        for (int i = 0; i < toDecode.length; i++) {
            System.out.println(decode(toDecode[i]));
        }
        ;
    }
}
