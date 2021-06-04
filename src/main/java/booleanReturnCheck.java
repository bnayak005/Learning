import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class booleanReturnCheck {
    public static String validateString() {
        String s = "Hello World (India)";
        System.out.println(s.split(" ").length);
        return Arrays.stream(s.split(" ")).filter(Pattern.compile("^.*[\\(\\)].*$").asPredicate()).findAny().get();
    }


    public static void main(String args[]){
        System.out.println(validateString());
    }

}
