public class DemoReplaceAll {
    public static void main(String[] args){
        String str1 = "Java123is456fun";

        String regex = "\\d+";

        System.out.println(str1.replaceAll(regex, " "));
    }
}

//15. Java String compares
//We can compare String in Java based on content and reference.
//It is used in authentication (by equals() method), sorting (by compareTo() method), and reference matching (by == operator) etc.
//There are three ways to compare String in Java:
//        ●	By Using equals() Method.
//        ●	By Using == Operator.
//●	By compareTo() Method.

