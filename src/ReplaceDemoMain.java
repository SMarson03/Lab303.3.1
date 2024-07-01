public class ReplaceDemoMain {
    public static void main(String[] args){
        String str1 = "abc cba";

        System.out.println(str1.replace('a', 'z'));

        System.out.println("Lava".replace('L', 'J'));

        System.out.println("Hello".replace('4', 'J'));

        //"C++" is replaced "Java"
        System.out.println(str1.replace("C++", "Java"));

        //replaces "aa" with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

    }
}
