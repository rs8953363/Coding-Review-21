package course2_day1;

public class RemoveChar {
    public static void main(String[] args) {

    }
   // A string is a sequence of characters.
   static String removeChar(String str, char c) {
       if (str == null)
           return null;
       return str.replaceAll(Character.toString(c), "newString");
   }
    String str = "hello";
    String str1 = new String("hello");

}
