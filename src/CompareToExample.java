public class CompareToExample {
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        //The above program shows the comparison between the various Strings. Notice:
        //if s1 > s2, it returns a positive number.
        //if s1 < s2, it returns a negative number.
        //if s1 == s2, it returns 0.
    }
}
