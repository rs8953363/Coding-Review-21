package course2_day1;

public class RemoveChar {
    public static void main(String[] args) {

    }
   // A string is a sequence of characters.
    static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c)
        static String removeChar(String str, char c) {
            if (str == null)
                return null;
            return str.replaceAll(Character.toString(c), "newString");
        }
        String str = "hello";
        String str1 = new String("hello");
//Interview question, check if the strings are equal.
        Equal Methods >> "==" or equals();
        public class StringDemo {
            public static void main(String args[]) {
                char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
                String helloString = new String(helloArray);
                System.out.println( helloString );
            }
        }"newString");
    }
    String str = “hello”;
    String str1 = new String(“hello”);
    //Interview question, check if the strings are equal.
    Equal Methods >> “==” or equals();
    public class StringDemo {
        public static void main(String args[]) {
            char[] helloArray = { ‘h’, ‘e’, ‘l’, ‘l’, ‘o’, ‘.’ };
            String helloString = new String(helloArray);
            System.out.println( helloString );
        }
    }
}
