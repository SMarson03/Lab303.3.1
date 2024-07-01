public class concatDemo {
    public static void main(String[] args){
        String str1 = "Learn";
        String str2 = "Java";
//concat both strings
        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));

        String s3 = "hello";
        String s4 = "Learners";

        String s5 = s3 + s4;

        String message = "Welcome" + "to" + "Java";

        String s = "Chapter" + 2;

        String s1 = "Supplement" + 'B';

        //8.charAt() method: Getting Characters From a String
        String message1 = "Welcome to Java";
        System.out.println("The first character in the message is" + message1.charAt(0));

    }
}
