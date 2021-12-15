package course2_day1;

public class StringClassPractice {
    String str = "hello"; // string is a char array [‘h’, ‘e’, ‘l’, ‘l’, ‘o’]

    // What is String in Java? String is a data type?
    // String is the most important class of the Java.
    // It has around 13 constructors and more than 40 methods.
    // It is a final and immutable(not changeable) class.

    // What are different ways to create String Object?

    String str1 = "hello"; // obj1

    String str2 = new String("hello");

    String str3 = "hello";

    // == >> it points out the memory location
    // equals() >> it point out the value

   // Getting String Length >> str.length()
    Getting Characters from a String >> str.charAt(0)
    Concatenating Strings >> str1 + str2
    Converting Strings >> “Welcome”.toUpperCase() returns a new string WELCOME.
            “Welcome”.toLowerCase() returns a new string welcome.
    Reading a String from the Console >> String s1 = input.nextLine();
    Obtaining Substrings >> message.substring(beginIncluded, endsNOTincluded);
    Stringbuffer and Stringbuilder <speed comparison>
}

