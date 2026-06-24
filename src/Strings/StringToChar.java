package Strings;

public class StringToChar {
    public static String charToString(char[] chars){
        String str = new String(chars);
        System.out.print("String: " + str);   
        return str;
    }

    public static void stringToChar(String str){
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
    }

    public static String integerToString(int num){
        String numString = Integer.toString(num);
        System.out.println("Integer to String: " + numString);
        return numString;
    }

    public static void main(String[] args) {
        char[] charArray = {'A', 'L', 'D', 'R', 'I', 'N'};
        String s = charToString(charArray);

        System.out.println();
        String str = "Pogi";
        stringToChar(str);

        System.out.println();
        int num  = 123;
        String n = integerToString(num);

        System.out.println(s + n);
    }
}
