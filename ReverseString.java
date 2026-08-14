public class ReverseString {

    public static String reverse(String str) {
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}