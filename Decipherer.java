/**
 * Decipherer
 */
public class Decipherer {
    // String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
    // String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    // String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

    public static void main(String[] args) {
        String message1 = ("0@sn9sirppa@#?ia'jgtvryko1");
        int stringSize = message1.length();
        System.out.println(stringSize / 2);
    }

    public void substring(int beginIndex, int endIndex) {
        String result = "0@sn9sirppa@#?ia'jgtvryko1".substring(6, 13);
        System.out.println(result);
    }

    // public void replace(String args[]) {
    // String s1 = "javatpoint is a very good website";
    // String replaceString = s1.replace('a', 'e');// replaces all occurrences of
    // 'a' to 'e'
    // System.out.println(replaceString);
    // }
}